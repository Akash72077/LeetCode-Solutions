class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        int result =0;
        int prefixSum=0;
        for(int num:nums ){
                prefixSum+=num;
                if(mp.containsKey(prefixSum-k)){
                    result+=mp.get(prefixSum-k);
                }
                mp.put(prefixSum, mp.getOrDefault(prefixSum, 0)+1);
        }
        return result;
    }
}