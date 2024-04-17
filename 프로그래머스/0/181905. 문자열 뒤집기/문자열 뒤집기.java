import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        int index = 0;
        String[] answer = my_string.split("");
        for (int i = s; i <= e; i++, index++) {
            answer[i] = String.valueOf(my_string.charAt(e-index));
        }
        
        return Arrays.stream(answer).collect(Collectors.joining(""));
    }
}