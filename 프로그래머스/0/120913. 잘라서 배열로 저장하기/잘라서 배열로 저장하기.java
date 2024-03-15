import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> strList = Arrays.stream(my_str.split("")).collect(Collectors.toList());
        for (int i = n; i < strList.size(); i+=n+1) {
            strList.add(i,"#");
        }
        
        return strList.stream().collect(Collectors.joining("")).split("#");
    }
}