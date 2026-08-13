class Solution {
    public int pivotInteger(int n) {
        int prefixSum=1;
        int suffixSum=n;
        int i=1, j=n;
        while(i<j){
            if(prefixSum<suffixSum){
                i++;
                prefixSum+=i;
            }else{
                j--;
                suffixSum+=j;
            }
        }

        if(suffixSum==prefixSum){
            return i;
        }

        return -1;
    }
}