class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i = 0 ; i <nums.length;i++){
            int sum = target - nums[i];
            if(map.containsKey(sum) && map.get(sum) != i){
                return new int[]{i , map.get(sum)};
            }
        }
        return new int[]{};
    }
}