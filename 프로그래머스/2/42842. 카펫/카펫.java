class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown+yellow;

        
        for (int i = 1; i <= (int) Math.sqrt(total); i++) {
            if (total%i == 0) {
               if (((total/i)*2 + (i*2)-4) == brown) return new int[]{total / i, i};
            }
        }

        return new int[]{};
    }
}