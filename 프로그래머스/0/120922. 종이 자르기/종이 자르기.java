class Solution {
    public int solution(int M, int N) {
        int result = 0;

        if (M != 1) result += (M-1);
        if (N != 1) result += (N-1)*M;
        
        return result;
    }
}