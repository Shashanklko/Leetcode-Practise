class StockSpanner {

    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while (!st.isEmpty() && st.peek()[0] <= price) {

            int[] top = st.pop();

            span += top[1];
        }

        st.push(new int[]{price, span});

        return span;
    }
}