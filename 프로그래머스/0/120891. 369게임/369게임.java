import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int order) {
        return Arrays.stream(String.valueOf(order).split(""))
            .filter("369"::contains).collect(Collectors.toList()).size();
    }
}