class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] arr = prices.clone();
        for(int i =  0 ; i<prices.length;i++){
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                int top = st.pop();
                arr[top] = prices[top]-prices[i];
            }
            st.push(i);
        }
        return arr;
    }
}