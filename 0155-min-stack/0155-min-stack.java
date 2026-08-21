class MinStack {

    Stack<Integer> st;
    Stack<Integer> stack;

    public MinStack() {
        
        st = new Stack<>();
        stack = new Stack<>();

    }
    
    public void push(int val) {

        if(st.isEmpty()){
            st.push(val);
        }
        else if(st.peek() >= val){
            st.push(val);
        }

        stack.push(val);
        
    }
    
    public void pop() {

        if(st.peek().equals(stack.peek())){
            st.pop();
        }

        stack.pop();
        
    }
    
    public int top() {

        return stack.peek();
        
    }
    
    public int getMin() {
        
        return st.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */