class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        if(n<3){
            return 0;
        }
        int count =0;
        int left =0;
        int right =2;
        while(right<n){
            char a=s.charAt(left);
            char b=s.charAt(left+1);
            char c=s.charAt(left+2);
            if(a!=b && b!=c && c!=a){
                count++;
            }
            left++;
            right++;
        }
        return count;
    }
}