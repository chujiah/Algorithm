import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int i, int j, int k) {
        String str = IntStream.range(i,j+1).mapToObj(String::valueOf).collect(Collectors.joining());
        return str.length() - str.replaceAll(String.valueOf(k),"").length();
    }
}