import java.util.*;

class Solution {
    HashSet<Integer> set = new HashSet<>();
    public int solution(String numbers) {

        dfs("", numbers);

        int count = 0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            int num = it.next();
            if (isPrime(num)) count++;
        }
        
        return count;
    }

    // 재귀
    private void dfs(String current, String numbers) {
        if (!"".equals(current)) {
            set.add(Integer.valueOf(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            dfs(current+numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i+1));
        }
    }

    private boolean isPrime(int num) {
        if (num == 0 || num == 1) return false;

        int lim = (int) Math.sqrt(num);

        for (int i = 2; i <= lim; i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}