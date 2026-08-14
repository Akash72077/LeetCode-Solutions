class Solution {
    public int maximumLengthSubstring(String s) {
        int max =0;
        int len= s.length();
        int []freq= new int[26];
        int left=0;
        for(int right=0; right<len; right++){
            
            freq[s.charAt(right)-'a']++;
            while(freq[s.charAt(right)-'a']>2){
                    freq[s.charAt(left)-'a']--;
                left++;
            }
            max=Math.max(max, right-left+1);
        }
        return max;
        
    }
}