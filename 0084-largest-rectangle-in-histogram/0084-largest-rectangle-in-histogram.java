class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int max = 0;

        for (int i = 0; i < heights.length; i++) {

            while (!st.isEmpty() &&
                   heights[st.peek()] > heights[i]) {

                int h = heights[st.pop()];

                int width = st.isEmpty()
                        ? i
                        : i - st.peek() - 1;

                max = Math.max(max, h * width);
            }

            st.push(i);
        }

        int n = heights.length;

        while (!st.isEmpty()) {
            int h = heights[st.pop()];

            int width = st.isEmpty()
                    ? n
                    : n - st.peek() - 1;

            max = Math.max(max, h * width);
        }

        return max;
    }
}