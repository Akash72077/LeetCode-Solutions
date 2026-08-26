class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2= new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1){
            st2.push(st.pop());
        }
        int pop =  st.pop();

        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        return pop;
    }
    
    public int peek() {
       while(st.size()>1){
            st2.push(st.pop());
        }
          int peek =  st.peek();

        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return st.isEmpty();
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