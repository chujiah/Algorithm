class Solution {
    public int solution(int a, int b) {
        int aPb = Integer.parseInt(""+a+b);
        return aPb >= 2*a*b ? aPb:2*a*b;
    }
}