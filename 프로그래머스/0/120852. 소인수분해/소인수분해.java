import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (n%i == 0) {
                n /= i;
                while(n % i == 0) {
                    n /= i;
                }
                list.add(i);
            }
        }
        
        return list.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }
}