class MinStack {
          Stack<Integer> st= new Stack<>();
        Stack<Integer> min= new Stack<>();

    public MinStack() {
      
    }
    
    public void push(int value) {
        if(min.isEmpty()||value<=min.peek()){
            min.push(value);
        }
       st.push(value); 
    }
    
    public void pop() {
         if(st.isEmpty()){
          return;
        }

        int pop =st.pop();
        if(pop == min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
       
        return min.peek();
    }
}
