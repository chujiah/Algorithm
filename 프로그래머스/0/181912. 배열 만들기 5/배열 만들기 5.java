import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String str : intStrs) {
            int v = Integer.parseInt(str.substring(s,l+s));
            if (v > k) list.add(v);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}