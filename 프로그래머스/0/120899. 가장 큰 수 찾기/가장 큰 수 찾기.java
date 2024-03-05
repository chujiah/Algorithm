import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int index = Arrays.stream(array).boxed().collect(Collectors.toList()).indexOf(max);
        return new int[]{max,index};
    }
}