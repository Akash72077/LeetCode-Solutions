class Solution {
    public String mergeAlternately(String s, String t) {

        int i = 0;
        int j = 0;
        String ans = "";

        while (i < s.length() && j < t.length()) {
            ans += s.charAt(i++);
            ans += t.charAt(j++);
        }

        while (i < s.length()) {
            ans += s.charAt(i++);
        }

        while (j < t.length()) {
            ans += t.charAt(j++);
        }

        return ans;
    }
}