class MinStack {
        Stack<Integer> a;
        Stack<Integer> b;
    public MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }
    
    public void push(int value) {
         a.push(value);
        if(b.isEmpty()){
            b.push(value);
        }else{
            b.push(Math.min(value, b.peek()));
        }
    }
    
    public void pop() {
        a.pop();
        b.pop();
    }
    
    public int top() {
     return a.peek();   
    }
    
    public int getMin() {
        return b.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */