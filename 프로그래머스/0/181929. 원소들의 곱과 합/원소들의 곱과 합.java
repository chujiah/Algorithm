class Solution {
    public int solution(int[] num_list) {
        int total1 = 1;
        int total2 = 0;
        for (int num: num_list) {
            total1 *= num;
            total2 += num;
        }
        
        return total1 < Math.pow(total2,2) ? 1:0;
    }
}