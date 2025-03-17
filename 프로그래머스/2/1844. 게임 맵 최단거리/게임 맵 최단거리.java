import java.util.*;

class Solution {
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            
            if (n-1 == x && m-1 == y) return distance;
            
            for (int[] direction: directions) {
                int nx = x+direction[0];
                int ny = y+direction[1];
                
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        q.add(new int[]{nx, ny, distance + 1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        
        return -1;
    }

}