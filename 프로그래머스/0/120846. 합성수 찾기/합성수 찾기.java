class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            int t = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    t++;
                }
            }
            
            if (t >= 1) answer++;
        }
        
        return answer;
    }
}