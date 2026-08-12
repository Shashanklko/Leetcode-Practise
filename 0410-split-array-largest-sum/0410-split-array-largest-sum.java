class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0 ;
        int high = 0;
        for(int num:nums){
            low = Math.max(low, num);
            high += num;
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(nums, k , mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private boolean isPossible(int[] nums , int k , int maxelement){
        int k_arr = 1;
        int subarray = 0;
        for(int num : nums){
            if(subarray+num<=maxelement){
                subarray+=num;
            }else{
                k_arr++;
                subarray = num;
            }
            if(k_arr>k){
                return false;
            }
        }
        return true;
    }
}