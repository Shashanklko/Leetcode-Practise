class Solution {
    public int removeElement(int[] nums, int val) { 
        int left = 0;
        for(int i:nums){
            if(i!=val){
                nums[left] = i;
                left++;
            }
        }
        return left;
    }
}