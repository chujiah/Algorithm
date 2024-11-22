import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> days = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            days.add((100 - progresses[i] + speeds[i] - 1)/speeds[i]);
        }

        List<Integer> answer = new ArrayList<>();
        
        int dayNum = days.get(0);
        int count = 1;
        for (int i = 1; i < days.size(); i++) {
            if (dayNum >= days.get(i)) {
                count++;
            } else {
                answer.add(count);
                count = 1;
                dayNum = days.get(i);
            }
        }
        
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}