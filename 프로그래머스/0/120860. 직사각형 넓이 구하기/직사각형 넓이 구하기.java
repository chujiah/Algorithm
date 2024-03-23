class Solution {
    public int solution(int[][] dots) {
        int xMax = dots[0][0];
        int xMin = dots[0][0];
        int yMax = dots[0][1];
        int yMin = dots[0][1];
        for (int dot[]:dots) {
            xMax = dot[0] > xMax ? dot[0]:xMax;
            xMin = dot[0] < xMin ? dot[0]:xMin;
            yMax = dot[1] > yMax ? dot[1]:yMax;
            yMin = dot[1] < yMin ? dot[1]:yMin;
        }
        
        return (xMax-xMin)*(yMax-yMin);
    }
}