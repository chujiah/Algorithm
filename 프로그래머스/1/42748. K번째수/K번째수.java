import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <commands.length; i++) {

            int[] sliceArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(sliceArray);
            resultList.add(sliceArray[commands[i][2]-1]);
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}