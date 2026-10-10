class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];

        arr[0] = 1;
        // First fill array with prefix product (arr[0]*nums[0]) 
        for(int i = 1; i<n;i++){
            arr[i] = arr[i-1] * nums[i-1];
        }

        int right = 1;

        //suffix product will created which will give result;
        for(int i=n-1;i>=0;i--){
            arr[i]*=right;
            right*=nums[i];
        }
        return arr;
    }
}