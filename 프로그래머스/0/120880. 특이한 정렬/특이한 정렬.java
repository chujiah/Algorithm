import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        List<Integer> numList = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        
        return numList.stream().sorted((a,b) -> {
            int indexA = numList.indexOf(a);
            int indexB = numList.indexOf(b);
            a = n>a?n-a:a-n;
            b = n>b?n-b:b-n;
            if (a.equals(b)) {
                return numList.get(indexA) > numList.get(indexB) ? -1:1;
            } else {
                return a.compareTo(b);
            }
        }).mapToInt(Integer::intValue).toArray();
    }
}