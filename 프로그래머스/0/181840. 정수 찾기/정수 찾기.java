class Solution {
    public int solution(int[] num_list, int n) {
        int result = 0;
        for (int num:num_list) {
            if (num == n) result = 1;
        }
        
        return result;
        
    }
}