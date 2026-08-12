class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[left]){
                nums[left+1] = nums[i];
                left++;
            }
        }
        return left+1;
    }
}