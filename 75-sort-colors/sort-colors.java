class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int Zero=0;
        int One=0;
        int Two=0;

        for(int i=0; i<n; i++ ){
            if(nums[i]==0){
                Zero++;
            }else if(nums[i]==1){
                One++;
            }
            else{
                Two++;
            }
        }

        for(int i=0; i<Zero; i++){
            nums[i]=0;
        }
        for(int i=Zero; i<Zero+One; i++){
            nums[i]=1;
        }
        for(int i=Zero+One; i<Zero+One+Two; i++){
            nums[i]=2;
        }
    }
}