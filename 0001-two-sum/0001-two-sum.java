import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Store number and its index
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the required pair
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices of the pair
            }
            
            map.put(nums[i], i); // Store current number with its index
        }
        
        return new int[]{}; // No solution case (won't happen as per constraints)
    }
}