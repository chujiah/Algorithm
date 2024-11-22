import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 스택
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i : arr) {
            if (!stack.peek().equals(i)) {
                stack.add(i);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size() ; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}