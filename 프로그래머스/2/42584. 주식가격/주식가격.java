import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        for (int i = 1; i < prices.length ; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) { // 만약 가격이 떨어졌을 경우
                int top = stack.pop();
                answer[top] = i - top;
            }
            stack.push(i);
        }
        
        // 가격이 안떨어진 인덱스들이 모여있음
        while(!stack.isEmpty()) {
            int top = stack.pop();
            answer[top] = prices.length - top -1;
        }
        
        return answer;
    }
}