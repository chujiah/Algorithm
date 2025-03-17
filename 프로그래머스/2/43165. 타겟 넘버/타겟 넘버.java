class Solution {
    int count = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }
    
    private void dfs(int[] numbers , int target, int current, int depth) {
        if (depth == numbers.length) {
            if (current == target) count++;
            return;
        }
        
        dfs(numbers, target, current+numbers[depth], depth+1);
        dfs(numbers, target, current-numbers[depth], depth+1);
    }
}