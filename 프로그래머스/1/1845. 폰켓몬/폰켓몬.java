import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        
        for (int i = 0;i < n; i++) {
            set.add(nums[i]);
        }
        
        return (set.size() >= n / 2) ? n / 2 : set.size();
    }
}