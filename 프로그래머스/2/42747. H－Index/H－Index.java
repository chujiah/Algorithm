import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        
        
        Arrays.sort(citations); 

        int n = citations.length; 
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        
        int answer = 0;
        return answer;
    }
}