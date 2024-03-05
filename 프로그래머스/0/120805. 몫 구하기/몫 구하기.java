class Solution {
    public int solution(int num1, int num2) {
        if (num1 < 0 || num2 > 100 || num2 < 0 || num2 > 100) return -1;
        return num1 / num2;
    }
}