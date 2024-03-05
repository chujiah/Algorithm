import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");

        int x = 0;
        int y = 0;
        for (String a : arr) {
            if (a.contains("x")) {
                x += a.equals("x") ? 1 : Integer.parseInt(a.replace("x",""));
            } else if (!a.equals("+")) {
                y += Integer.parseInt(a);
            }
        }

        List<String> list = new ArrayList<>();
        if (x > 0) {
            String xStr = x > 1 ? x+"x":"x";
            list.add(xStr);
            if (y > 0) list.add(" + ");
        }
        if (y > 0) {
            list.add(String.valueOf(y));
        }

        return list.stream().collect(Collectors.joining());
    }
}