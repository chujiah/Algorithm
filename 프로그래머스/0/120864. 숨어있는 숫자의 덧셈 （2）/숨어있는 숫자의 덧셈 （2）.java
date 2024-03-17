import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]", " ").split(" ")).mapToInt(v -> {
            if (!"".equals(v)) {
                return Integer.valueOf(v);
            }
            return 0;
        }).sum();
    }
}