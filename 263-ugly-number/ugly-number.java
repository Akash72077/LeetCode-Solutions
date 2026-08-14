class Solution {
    public boolean isUgly(int n) {
        // ArrayList<Integer> ans= new ArrayList<>();
        // if(n==1 || n==2|| n==3|| n==5){
        //     return true;
        // }
        // for(int i=4; i<=n/2; i++){
        //         if(n%i==0){
        //             return false;
        //         }
        // }
       
        // return true;
     while(n>1){
            if(n%2==0){
                n/=2;
            }else if(n%3==0){
                n/=3;
            }else if(n%5==0){
                n/=5;
            }else{
                return false;
            }
        }

        if(n==1){
    return true;
}
   
return false;

    }
}