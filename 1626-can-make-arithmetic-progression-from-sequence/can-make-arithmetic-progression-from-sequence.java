class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        int n=arr.length;
        for(int i=2; i<n; i++){
            int ans= arr[i]-arr[i-1];
            if(ans!=diff){
                return false;
            }
        }
        return true;
    }
}