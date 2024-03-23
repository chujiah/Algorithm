class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int t = 1;
        for (int i = 1; t <= n; i++) {
            t *= i;
            answer = i;
        }
        return answer-1;
    }
}