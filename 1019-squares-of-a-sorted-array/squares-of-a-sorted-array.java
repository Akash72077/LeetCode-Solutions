class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []s= new int[n];
        int i=0; 
        int j=n-1;
      for(int p=n-1; p>=0; p--){
        if(Math.abs(nums[i])>Math.abs(nums[j])){
            s[p]=nums[i]*nums[i];
            i++;
        }else{
              s[p]=nums[j]*nums[j];
              j--;
        }
      }
      return s;
    }
}