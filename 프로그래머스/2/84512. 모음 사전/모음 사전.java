import java.util.*;

class Solution {
    List<String> list = new ArrayList<>();
    String[] words = {"A","E","I","O","U"};
    
    public int solution(String word) {
        dfs("",0);
        return list.indexOf(word);
    }
    
    private void dfs(String current, int depth) {
        if (depth > 5) return;
        
        list.add(current);
        for (String word : words) {
            dfs(current+word, depth+1);
        }
    }
    
        
}