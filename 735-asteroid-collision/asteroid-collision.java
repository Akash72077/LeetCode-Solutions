class Solution {
    public int[] asteroidCollision(int[] nums) {
        int n= nums.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            int stone = nums[i];
           if(st.isEmpty()|| stone>0){
             st.push(stone);
             }
             else{
               
                    while(!st.isEmpty() && Math.abs(stone)>st.peek() && st.peek() >0){
                         st.pop();
                      
                    }
                   
                if(st.isEmpty()  || st.peek()<0){ 
                    st.push(stone);
                }else if(st.peek()== Math.abs(stone)){
                    st.pop();
                }
            }
        }
        int arr[]= new int[st.size()];
        int i=0;
        for(int num: st){
            arr[i]=num;
            i++;
        }
        return arr;
    }
}