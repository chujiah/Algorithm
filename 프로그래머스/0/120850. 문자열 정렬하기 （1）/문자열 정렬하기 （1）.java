import java.util.*;
import java.util.regex.*;

class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.split("")).filter(v -> Pattern.matches("\\d", v)).mapToInt(Integer::parseInt).sorted().toArray();
    }
}