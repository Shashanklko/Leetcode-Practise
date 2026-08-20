class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(arr, -1);
        for(int i = 0 ; i <2*nums.length;i++){
            int index = i%(nums.length);
            while(!st.isEmpty() && nums[st.peek()]<nums[index]){
                int top = st.pop();
                arr[top] = nums[index]; 
            }
            if(i<nums.length){
                 st.push(index);
            }
        }
        return arr;
    }
}