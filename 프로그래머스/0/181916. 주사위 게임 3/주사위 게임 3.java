import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int v : new int[]{a,b,c,d}) {
            list.add(v);
        }

        List<Integer> set = new ArrayList<>(new HashSet<>(list));
        if (set.size() == 1) {
            answer = 1111*a;
        } else if (set.size() == 2) {
            int cnt = Collections.frequency(list,set.get(0));
            int cnt2 = Collections.frequency(list,set.get(1));

            if (cnt == cnt2) {
                answer =  (set.get(0) + set.get(1)) * Math.abs(set.get(0)-set.get(1));
            } else {
                int p = cnt > cnt2 ? set.get(0):set.get(1);
                int q = cnt > cnt2 ? set.get(1):set.get(0);
                answer = (int) Math.pow((double) (10*p) + q, 2);
            }
        } else if (set.size() == 3) {
            answer = 1;
            for (int v : set) {
                if (Collections.frequency(list, v) < 2) answer *= v;
            }
        } else {
            int[] arr = new int[]{a,b,c,d};
            Arrays.sort(arr);
            answer = arr[0];
        }

        return answer;
    }
}