class MinStack {

    ArrayList<Integer> minStack;
    // int min;÷
    int top;

    public MinStack() {
        minStack=new ArrayList<>();
        // min=Integer.MAX_VALUE;
        top=-1;
    }
    
    public void push(int val) {
        minStack.add(val);
        top++;
    }
    
    public void pop() {
        minStack.remove(top);
        top--;
    }
    
    public int top() {
        return minStack.get(top);
    }
    
    public int getMin() {
        return Collections.min(minStack);
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