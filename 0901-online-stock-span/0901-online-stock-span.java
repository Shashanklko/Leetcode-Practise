class StockSpanner {
        Stack<Integer> st ;
        int[] prices;
        int index;
    public StockSpanner() {
        st = new Stack<>();
        prices = new int[10000];
        index = 0;
    }
    
    public int next(int price) {
        prices[index] = price;
        while(!st.isEmpty() && prices[st.peek()]<=price){
            st.pop();
        }
        int span;
        if(!st.isEmpty()){
            span = index-st.peek();
        }else{
            span = index+1;
        }
        st.push(index);
        index++;

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */