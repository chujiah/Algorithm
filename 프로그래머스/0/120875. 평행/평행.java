import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] dots) {
       int[] answer = {0};
		for (int i = 1 ; i < dots.length; i++) {
			int x1 = dots[0][0];
			int y1 = dots[0][1];

			int x2 = dots[i][0];
			int y2 = dots[i][1];

			int[] fi = {i};
			List<Integer> n = Arrays.stream(new int[]{1, 2, 3}).filter(v -> v != fi[0]).boxed().collect(Collectors.toList());
			int xx1 = dots[n.get(0)][0];
			int yy1 = dots[n.get(0)][1];

			int xx2 = dots[n.get(1)][0];
			int yy2 = dots[n.get(1)][1];


			double m1 = (double) (y2 - y1) /(x2-x1);
			double m2 = (double) (yy2 - yy1) /(xx2-xx1);

			if (m1 == m2) answer[0] += 1;
		}

		return answer[0] > 0 ? 1:0;
    }
}