import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int result = String.valueOf(num).indexOf(String.valueOf(k));
        return result == -1? -1:result+1;
    }
}