import java.util.stream.IntStream;

class Solution {
    public int solution(int[] sides) {
        return (int) IntStream.range((Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1]))+1, sides[0]+sides[1]).count();
    }
}