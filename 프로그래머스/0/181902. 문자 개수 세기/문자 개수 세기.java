import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String my_string) {
        String str = "";
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        
        List<Integer> answer = new ArrayList<>();
        for(int i = 65; i <= 122; i++) {
            if (!(i >= 91 && i <= 96)) answer.add(Collections.frequency(list, String.valueOf((char) i)));
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}