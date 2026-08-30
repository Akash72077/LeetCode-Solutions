class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minIndex=0;
        int maxIndex=0;
        int min=0;
        int max=0;
        for(int i=0; i<n; i++){
            if(nums[i]>nums[maxIndex])
                maxIndex=i;
            if(nums[i] < nums[minIndex])
                 minIndex = i;
        }
        if(minIndex>maxIndex){
            int temp=maxIndex;
            maxIndex=minIndex;
            minIndex=temp;
        }
        int front = maxIndex+1;
        int back=n-minIndex;
       int both = (minIndex + 1) + (n - maxIndex);

       return Math.min(Math.min(front, back), both);
    }
}