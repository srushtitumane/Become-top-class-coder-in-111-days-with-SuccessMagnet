class CustomStack {
    Stack<Integer> stack;
    int maxSize = 0;
    int[] inc;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new Stack<>();
        inc = new int[maxSize];
    }
    
    public void push(int x) {
        if(stack.size() < inc.length)
        {
            stack.push(x);
        }
    }
    
    public int pop() {
        if(!stack.isEmpty())
            return stack.pop();
        return -1;
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k,stack.size());
        for(int i=0; i<limit; i++)
            stack.set(i, stack.get(i)+val);
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */