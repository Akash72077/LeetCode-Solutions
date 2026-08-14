class Solution {
    public String mergeAlternately(String s, String t) {

        int i = 0;
        int j = 0;
        StringBuilder ans = new StringBuilder();

        while (i < s.length() && j < t.length()) {
            ans.append(s.charAt(i++));
            ans.append(t.charAt(j++));
        }

        while (i < s.length()) {
            ans.append(s.charAt(i++));
        }

        while (j < t.length()) {
            ans.append(t.charAt(j++));
        }

        return ans.toString();
    }
}