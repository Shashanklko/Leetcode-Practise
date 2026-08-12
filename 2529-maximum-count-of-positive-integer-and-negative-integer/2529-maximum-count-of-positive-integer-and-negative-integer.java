class Solution {
    public int maximumCount(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int neg = low;

       
        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] <= 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int pos = nums.length - low;

        return Math.max(pos, neg);
    }
}