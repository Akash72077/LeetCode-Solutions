class Solution {
public:
    string mergeAlternately(string s, string t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        string ans = "";
        int k = 0;
        int l = 0;

        while (i >= 0 && j >= 0) {
            ans += s[k++];
            ans += t[l++];

            i--;
            j--;
        }

        if (i >= 0) {
            while (i >= 0) {
                ans += s[k++];
                i--;
            }
        } 
        else {
            while (j >= 0) {
                ans += t[l++];
                j--;
            }
        }

        return ans;
    }
};