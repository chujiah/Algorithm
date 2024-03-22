import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    if (i != 0) {
                        if (board[i-1][j] != 1) board[i-1][j] = 2; //위
                        if (j != board.length-1 && board[i-1][j+1] != 1) board[i-1][j+1] = 2;
                        if (j != 0 && board[i-1][j-1] != 1) board[i-1][j-1] = 2;
                    }

                    if (i != board.length-1) {
                        if (board[i+1][j] != 1) board[i+1][j] = 2; //아래
                        if (j != board.length-1 && board[i+1][j+1] != 1) board[i+1][j+1] = 2;
                        if (j != 0 && board[i+1][j-1] != 1) board[i+1][j-1] = 2;
                    }
                    if (j != 0 && board[i][j-1] != 1) {
                        board[i][j-1] = 2; //왼
                    }
                    if (j != board.length-1 && board[i][j+1] != 1) {
                        board[i][j+1] = 2; //오
                    }
                }
            }
        }

        int result = 0;
        for (int[] b : board) {
            result += Arrays.stream(b).boxed().mapToInt(Integer::intValue).filter(v -> v == 0).count();
        }

        return result;
    }
}