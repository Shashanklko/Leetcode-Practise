class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = 0;
        int element = 0;
        for(int i = 0; i<nums.length;i++){
            int key = nums[i];
            if(max<map.get(key)){
                max = map.get(key);
                element= key;
            }
        }
        return element;
    }
}