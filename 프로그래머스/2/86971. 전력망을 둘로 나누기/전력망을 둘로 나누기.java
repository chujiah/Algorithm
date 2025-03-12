import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int minCount = Integer.MAX_VALUE;
        List<List<Integer>> tree = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int[] wire: wires) {
            tree.get(wire[0]).add(wire[1]);
            tree.get(wire[1]).add(wire[0]);
        }

        for (int[] wire: wires) {
            int v1 = wire[0];
            int v2 = wire[1];

            tree.get(v1).remove(Integer.valueOf(v2));
            tree.get(v2).remove(Integer.valueOf(v1));

            boolean[] visited = new boolean[n+1];
            int v1Cnt = dfs(tree, visited, v1);

            int cnt = Math.abs(v1Cnt - (n-v1Cnt));
            minCount = Math.min(minCount, cnt);

            tree.get(v1).add(v2);
            tree.get(v2).add(v1);
        }

        return minCount;
    }


    private int dfs(List<List<Integer>> tree, boolean[] visited, int v) {
        visited[v] = true;
        int count = 1;

        for (int otherV : tree.get(v)) {
            if (!visited[otherV]) {
                count += dfs(tree,visited,otherV);
            }
        }

        return count;
    }
}