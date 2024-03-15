import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int result = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            if (!"+-".contains(arr[i])) {
                String m = arr[i-1];
                int a = Integer.parseInt(arr[i]);
                result = "+".equals(m) ? result+a:result-a;
            }
        }

        return result;
    }
}