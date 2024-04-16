import java.util.*;

class Solution {
   public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.empty()){
                stk.add(arr[i]);
                i++;
            } else {
                if (stk.lastElement() < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } else if (stk.lastElement() >= arr[i]) {
                    stk.pop();
                }
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}