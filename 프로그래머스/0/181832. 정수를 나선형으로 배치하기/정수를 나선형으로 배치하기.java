class Solution {
    public int[][] solution(int n) {
		int[][] result = new int[n][n];
		int num = 1;
		int m = 0;
		while (m < n) {

			for (int i = m; i < n-m; i++) {
				result[m][i] = num;
				num++;
			}

			for (int i = m+1; i < n-m; i++) {
				result[i][n-m-1] = num;
				num++;
			}

			for (int i = n-m-2; i >= m; i--) {
				result[n-m-1][i] = num;
				num++;
			}

			for (int i = n-m-2; i >=m+1; i-- ) {
				result[i][m] = num;
				num++;
			}

			m++;
		}

		return result;
	}
}