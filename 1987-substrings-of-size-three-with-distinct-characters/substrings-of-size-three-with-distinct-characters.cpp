class Solution {
public:
    int countGoodSubstrings(string s) {
        int n=s.size();
    int count=0;
    for(int left =0; left<n-2; left++){
        char a= s.at(left);

        char b= s.at(left+1);
        char c= s.at(left+2);
        if(a!=b && b!=c && c!=a){
            count ++;
        }
    }
    return count; 
    }
};