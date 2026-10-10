import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        
        // HashMap to store (prefixSum -> frequency of this prefixSum)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: A prefix sum of 0 has occurred once (handles subarrays starting from index 0)
        map.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            
            // If (prefixSum - k) exists in the map, it means a valid subarray ending here sums to k
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            
            // Record the current prefixSum into the map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}
