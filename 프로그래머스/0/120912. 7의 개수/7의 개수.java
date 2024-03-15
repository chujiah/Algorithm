import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        String str = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining());
        return Arrays.stream(str.split("")).filter(v -> v.equals("7")).collect(Collectors.toList()).size();
    }
}