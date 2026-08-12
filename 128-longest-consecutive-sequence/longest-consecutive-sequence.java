class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
       Arrays.sort(nums);
       int count =1;
       int max=1;
       for(int i=0; i<n-1; i++){

         if (nums[i + 1] == nums[i]) {
                continue;   // duplicate
            }

        if(nums[i+1]-nums[i]==1){
            count++;
            max=Math.max(count,max );
        }else{
            count=1;
        }
        
       }
       return max;
    }
}