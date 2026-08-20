class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<nums2.length;i++){
            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                int top = st.pop();
                map.put(nums2[top], nums2[i]);
            }
            st.push(i);
        }
        int[] arr = new int[nums1.length];
         for(int i = 0 ; i<nums1.length;i++){
            arr[i] = map.getOrDefault(nums1[i], -1);
        }
        return arr;
    }
}