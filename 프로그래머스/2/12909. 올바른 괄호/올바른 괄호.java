class Solution {
    boolean solution(String s) {
        int i = 0; // ( 수
        int j = 0; // ) 수
        for (String a : s.split("")) {
            if (a.equals("(")) {
                i++;
            } else {
                j++;
            }
            
            if (i < j) return false;
        }


        return i == j ? true:false;
    }
}