class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum  = 0;
        for(int i = 0; i<k;i++){
            sum+=nums[i];
        }
        int max = sum;
        int left = 0;
        for(int j = k;j<nums.length;j++){
            sum += nums[j] - nums[left];
            max = Math.max(max, sum);
            left++;
        }
        return (double)max/k;
    }
}