class MyStack {
        Queue<Integer> a;
        Queue<Integer> b;
    public MyStack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }
    
    public void push(int x) {
        b.add(x);
        while(!a.isEmpty()){
            b.add(a.remove());
        }
        Queue<Integer> temp = a;
         a=b;
         b= temp;
    }
    
    public int pop() {
        return a.remove();
    }
    
    public int top() {
        return a.peek();
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */