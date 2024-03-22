class Solution {
    public int solution(int a, int b) {
        int result = 1;
        int maxCnt = 1;
        for (int i = 2; i <= Math.max(a,b) ; i++) {
            if (a%i == 0 && b%i == 0) {
                maxCnt = i;
            }
        }
        
        a /= maxCnt;
        b /= maxCnt;
        
        int num = b;
        while (num > 1) {
            if (num%2 == 0) {
                num /= 2;
            } else if (num%5 == 0) {
                num /= 5;
            } else {
                result = 2;
                break;
            }
        }
        
        return result;
        
    }
}