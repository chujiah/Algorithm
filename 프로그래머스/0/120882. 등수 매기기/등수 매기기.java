import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Double> list = new ArrayList<>();
        for (int[] info : score) {
            list.add((double)(info[0]+info[1])/2);
        }

        List<Double> orderList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        return list.stream().map(v -> orderList.indexOf(v)+1).mapToInt(Integer::valueOf).toArray();
    }
}