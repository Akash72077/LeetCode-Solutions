class MyStack {
 Queue<Integer> q1 = new LinkedList<>();
 Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {
       
    }
    public void push(int x) {
        q1.offer(x);
       
    }
    
    public int pop() {
         while(q1.size()>1){
            q2.offer(q1.poll());

        }
        int pop = q1.poll();
        q1=q2;
        q2= new LinkedList<>();

        return pop;
    }
    
    public int top() {
         while(q1.size()>1){
            q2.offer(q1.poll());

        }
        int peek = q1.peek();
        q2.offer(peek);

        q1=q2;
        q2= new LinkedList<>();

        return peek;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
