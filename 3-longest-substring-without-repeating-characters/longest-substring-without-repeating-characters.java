class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int i=0; i<n; i++){
             HashSet<Character> hs= new HashSet<>();
            for(int j=i; j<n; j++){
                if(hs.contains(s.charAt(j))){
                    break;
                }
                hs.add(s.charAt(j));
                 max =Math.max(max, j-i+1);
            }
        }
        return max;
    }
}