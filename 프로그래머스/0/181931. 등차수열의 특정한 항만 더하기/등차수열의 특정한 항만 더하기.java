class Solution {
    public int solution(int a, int d, boolean[] included) {
        int total = 0;
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            total += i == 0 ? a : d;
            if (included[i]) {
                answer += total;
            }
        }
        
        return answer;
    }
}