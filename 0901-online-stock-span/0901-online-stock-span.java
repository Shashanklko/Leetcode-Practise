class StockSpanner {

    Stack<Integer> st;
    int[] prices;
    int index;

    public StockSpanner() {
        st = new Stack<>();
        prices = new int[10000];
        index = 0;
    }

    public int next(int price) {

        prices[index] = price;

        while (!st.isEmpty() && prices[st.peek()] <= price) {
            st.pop();
        }

        int span;

        if (st.isEmpty()) {
            span = index + 1;
        } else {
            span = index - st.peek();
        }

        st.push(index);
        index++;

        return span;
    }
}