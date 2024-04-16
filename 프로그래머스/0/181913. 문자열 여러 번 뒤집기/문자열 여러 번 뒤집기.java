import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] q : queries) {
            int index = q[0];
            for (int a = q[1]; a >= q[0]; a--) {
                sb.setCharAt(index, my_string.charAt(a));
                index++;
            }
            my_string = sb.toString();
        }
        return my_string;
    }
}