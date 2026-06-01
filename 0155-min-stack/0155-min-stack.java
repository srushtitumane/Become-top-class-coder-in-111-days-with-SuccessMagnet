class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
        
    }
    
    public void push(int val) {
        stack1.push(val);
        if(stack2.isEmpty()){
            stack2.push(val);
        }
        else{
            stack2.push(Math.min(stack2.peek(),val));
        }
        
    }
    
    public void pop() {
        if(!stack1.isEmpty()){
            stack1.pop();
            stack2.pop();
        }
        
    }
    
    public int top() {
        if(!stack1.isEmpty()){
            return stack1.peek();
        }
        return -1;
        
    }
    
    public int getMin() {
        if(!stack2.isEmpty()){
            return stack2.peek();
        }
        return -1;
        
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