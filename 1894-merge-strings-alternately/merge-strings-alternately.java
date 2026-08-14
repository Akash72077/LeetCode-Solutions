class Solution {
    public String mergeAlternately(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        String ans="";
        int k=0;
        int l=0;
        while(i>=0 && j>=0){
            ans+=s.charAt(k++);
            ans+=t.charAt(l++);
            i--;
            j--;
        }
        if(i>=0){
             while(i>=0){
            ans+=s.charAt(k++);
            i--;
        }
        }else{

            while(j>=0){
            
            ans+=t.charAt(l++);
            j--;
        }

        }
        return ans;
    }
}