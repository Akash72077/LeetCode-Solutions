class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int min=Integer.MAX_VALUE;
        int currSum=0;
         int left=0;
         int right=0;
         while(right<nums.length){
            currSum+=nums[right];
            right++;

            while(currSum>=target){
                int currWindowSize= right -left;

                min=Math.min(currWindowSize, min);
                currSum-=nums[left];
                left++;
            }
         }
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}