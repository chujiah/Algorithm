class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int[] query : queries) {
            int a = arr[query[1]];
            int b = arr[query[0]];
            arr[query[0]] = a;
            arr[query[1]] = b;
        }

        return answer;
    }
}