import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int a = Arrays.stream(array).map(v -> {
            if (n < v) {
                return v - n;
            } else {
                return n - v;
            }
        }).min().getAsInt();

        return Arrays.stream(array).filter(v -> n == v + a || n == v - a).min().getAsInt();
    }
}