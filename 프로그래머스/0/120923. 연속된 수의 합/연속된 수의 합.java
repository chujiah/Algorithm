import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        for (int i = 1; i < 101; i++) {
            int p = 0;
            int m = 0;
            
            int[] pArr = new int[num];
            int[] mArr = new int[num];
            for (int j = 0 ; j < num ; j++) {
                p += i+j;
                m += i-j;
                
                pArr[j] = i+j;
                mArr[j] = i-j;
            }
            
            Arrays.sort(pArr);
            Arrays.sort(mArr);
            
            if (total == p) {
                return pArr;
            } else {
                if (total == m) {
                    return mArr;
                }
            }
        }

        return new int[num];
    }
}