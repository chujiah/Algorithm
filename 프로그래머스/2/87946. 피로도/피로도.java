class Solution {
    int maxCount = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0, visited);
        return maxCount;
    }
    
    private void dfs(int hp, int[][] dungeons, int depth, boolean[] visited) {
        maxCount = Math.max(maxCount,depth);
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && hp >= dungeons[i][0]) {
                visited[i] = true;
                dfs(hp-dungeons[i][1], dungeons, depth+1, visited);
                visited[i] = false;
            }
        }
    }
}