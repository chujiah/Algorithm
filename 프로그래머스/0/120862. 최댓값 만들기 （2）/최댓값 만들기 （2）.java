import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0]*numbers[1];
        for (int number : numbers) {
            for (int i : numbers) {
                if (number != i) {
                    max = Math.max(max, number * i);
                }
            }
        }

        return max;
    }
}