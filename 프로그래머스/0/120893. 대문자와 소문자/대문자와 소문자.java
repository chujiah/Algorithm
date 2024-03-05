import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).map(v -> {
            if (Character.isUpperCase(v.charAt(0))) {
                return String.valueOf(Character.toLowerCase(v.charAt(0)));
            } else {
                return String.valueOf(Character.toUpperCase(v.charAt(0)));
            }
        }).collect(Collectors.joining(""));
    }
}