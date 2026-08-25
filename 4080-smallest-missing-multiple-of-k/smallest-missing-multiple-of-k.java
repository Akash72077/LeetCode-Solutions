class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0; i<n; i++){
        hs.add(nums[i]);
      }

     int multiple=k;
     while(hs.contains(multiple)){
        multiple+=k;
     }
        return multiple;
    }
}