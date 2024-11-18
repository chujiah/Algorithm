import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        for (int num : nums) {
            setNums.add(num);
        }
        
        return setNums.size() >= nums.length/2? nums.length/2:setNums.size();
    }
}