import java.util.regex.Pattern;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.range(l,r+1).mapToObj(v -> String.valueOf(v).replaceAll("[1-4]|[6-9]", "#")).filter(v -> !v.contains("#")).mapToInt(Integer::parseInt).toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}