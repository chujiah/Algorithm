class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if (a%2 != 0) {
            answer = b%2 != 0 ? (a*a) + (b*b) : 2*(a+b);
        } else {
            answer = b%2 != 0 ? 2*(a+b):(a-b) < 0 ? (a-b)*(-1):(a-b);
        }
        
        return answer;
    }
}