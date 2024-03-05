class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int xMax = (board[0])/2;
        int xMin = xMax * -1;
        int yMax = (board[1])/2;
        int yMin = yMax * -1;

        int x = 0;
        int y = 0;
        for (String point : keyinput) {
            int value = "right".equals(point) || "up".equals(point) ? 1: -1;
            if ((x < xMax && "right".equals(point)) || (x > xMin && "left".equals(point))) {
                x += value;
            } else if ((y < yMax && "up".equals(point)) || (y > yMin && "down".equals(point))) {
                y += value;
            }
        }
        return new int[]{x,y};
    }
}