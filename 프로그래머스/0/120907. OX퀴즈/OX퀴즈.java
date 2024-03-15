import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz).map(str -> {
            String[] arr = str.split(" ");
            int n = 0;
            if (arr[1].equals("+")) {
                n = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            } else {
                n = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            }

            return n == Integer.parseInt(arr[4])? "O":"X";
        }).collect(Collectors.joining("")).split("");
    }
}