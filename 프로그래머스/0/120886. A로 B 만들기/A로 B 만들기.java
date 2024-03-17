import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String before, String after) {
        String beforeSorted = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String afterSorted = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());
        
        return beforeSorted.equals(afterSorted) ? 1:0;
    }
}