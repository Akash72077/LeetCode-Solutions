class Solution {
    public int countGoodSubstrings(String s) {
    int n=s.length();
    int count=0;
    for(int left =0; left<n-2; left++){
        char a= s.charAt(left);

        char b= s.charAt(left+1);
        char c= s.charAt(left+2);
        if(a!=b && b!=c && c!=a){
            count ++;
        }
    }
    return count;
    }
}