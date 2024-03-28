import java.util.*;

class Solution {
    public String solution(String code) {
        int mode = 0;
        String[] codeArr = code.split("");
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < codeArr.length ; i++) {
            if (codeArr[i].equals("1")) {
                mode = mode == 0 ? 1:0;
            } else {
                if ((mode == 0 && i%2 == 0) || (mode == 1 && i%2 != 0)) {
                    sb.append(codeArr[i]);
                }
            }
        }
        
        return sb.length() != 0? sb.toString():"EMPTY";
    }
}