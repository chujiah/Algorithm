class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int index = 0;
        for (int i = n-1; i < num_list.length; i+=n, index++) {
            int[] arr = new int[n];
            for (int j = n-1; j >= 0; j--) {
                arr[(n-1)-j] = num_list[i-j];
            }
            answer[index] = arr;
        }
        
        return answer;
    }
}