class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[prices.length];
        for(int i =  0 ; i<prices.length;i++){
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                int top = st.pop();
                arr[top] = prices[top]-prices[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int top = st.pop();
            arr[top] = prices[top];
        }

        return arr;
    }
}