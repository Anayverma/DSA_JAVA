class MyQueue {
    Stack<Integer> queue;
    public MyQueue() {
        queue=new Stack<>();
    }
    
    public void push(int x) {
        queue.push(x);
        System.out.println(queue.size());
    }
    
    public int pop() {
        if(queue.size()==0) return 0;
        int l=queue.size();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<l;i++) st.push(queue.pop());
        int n=st.pop();
        for(int i=0;i<l-1;i++)    queue.push(st.pop());
        return n;
    }
    public int peek() {
        Stack<Integer> st=new Stack<>();
        int l=queue.size();
        for(int i=0;i<l;i++) {st.push(queue.pop());}
        for(int i=0;i<l-1;i++) {System.out.println(st.peek());}
        int n=st.pop();
        queue.push(n);
        for(int i=0;i<l-1;i++)    queue.push(st.pop());
        return n;
    }
    
    public boolean empty() {
        return (queue.size()==0?true:false);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */