class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0 ; i<k;i++){
            sum+=nums[i];
        }
        double max = sum;
        for(int right = k;right<nums.length;right++){
            sum+=nums[right];
            sum-=nums[right-k];
            max = Math.max(max, sum);
        }
        return max/k;
    }
}