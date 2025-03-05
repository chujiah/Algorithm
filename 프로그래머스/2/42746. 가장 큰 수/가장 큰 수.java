import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strArr = Arrays.stream(numbers).mapToObj(String::valueOf)
                .toArray(String[]::new);
        
        Arrays.sort(strArr, (a, b) -> (b+a).compareTo(a+b));
        
        if (strArr[0].equals("0")) {
            return "0";
        }
        
        return String.join("", strArr);
    }
}