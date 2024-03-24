
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String[] strArr = a.split("");
        for(int i = 0; i < strArr.length; i++) {
            if(Character.isLowerCase(strArr[i].charAt(0))) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }

        System.out.println(Arrays.stream(strArr).collect(Collectors.joining()));
    }
}