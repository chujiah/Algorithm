class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = numLog.length-1; i > 0; i--) {
            int c = numLog[i] - numLog[i-1];
            
            sb.append(c == 10 ? "d": c == -10 ? "a": c == 1? "w":"s");
        }
        
        return sb.reverse().toString();
    }
}