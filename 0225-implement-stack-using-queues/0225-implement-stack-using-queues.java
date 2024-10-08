class MyStack {
    Queue<Integer> stack;
    public MyStack() {
        stack=new LinkedList<>();
    }
    
    public void push(int x) {
        stack.add(x);
        for(int i=0;i<stack.size()-1;i++)   stack.add(stack.poll());
    }
    
    public int pop() {
        return stack.remove();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return (stack.size()==0?true:false);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.add(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */