import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        List<String> result = new ArrayList<>();
        for (String a : s.split("")) {
            if (s.indexOf(a) == s.lastIndexOf(a)) {
                result.add(a);
            }
        }
        return result.stream().sorted().collect(Collectors.joining());
    }
}