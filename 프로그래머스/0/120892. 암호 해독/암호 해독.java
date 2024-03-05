import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String cipher, int code) {
        String[] strArr = cipher.split("");
        List<String> result = new ArrayList<>();
        IntStream.range(0,cipher.split("").length).forEach(i -> {
            if ((i+1)%code == 0) result.add(strArr[i]);
        });

        return String.join("", result);
    }
}