import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");
        String a = arr[num1];
        
        arr[num1] = arr[num2];
        arr[num2] = a;
        
        return Arrays.stream(arr).collect(Collectors.joining());
    }
}