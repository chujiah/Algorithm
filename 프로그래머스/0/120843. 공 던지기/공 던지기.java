import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int result = 1;
        int ball = 0;
        for (int i = 1; i < k ; i++) {
            ball += 2;
            if (ball > numbers.length-1) {
                result = numbers[ball - (numbers.length)];
                ball = ball - (numbers.length);
            } else {
                result = numbers[ball];
            }
        }
        
        return result;
    }
}