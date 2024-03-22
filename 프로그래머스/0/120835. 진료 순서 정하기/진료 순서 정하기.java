import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> list = Arrays.stream(emergency).boxed().collect(Collectors.toList());
        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        int[] result = new int[emergency.length];
        for (int i = 0; i < sortedList.size(); i++) {
            result[list.indexOf(sortedList.get(i))] = i+1;
        }
        
        return result;
    }
}