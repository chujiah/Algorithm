class Solution {
    public int solution(int[] common) {
        int num = (common[2] - common[0])/2;
        int lastNum = common[common.length -1];
        
        if (common[2] - common[1] == num) {
            return lastNum + num;
        } else {
            int num2 = common[2] / common[1];
            return lastNum * num2;
        }
    }
}