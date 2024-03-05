class Solution {
    public int solution(int hp) {
        int answer = 0;

        answer += Math.floor(hp/5);
        answer += Math.floor(hp%5/3);
        answer += Math.floor((hp%5)%3/1);
        return answer;
    }
}