class Solution {
    public int solution(int a, int b) {
        int aPb = Integer.parseInt(String.valueOf(a) + b);
        int bPa = Integer.parseInt(String.valueOf(b) + a);
        
        return aPb >= bPa ? aPb:bPa;
    }
}