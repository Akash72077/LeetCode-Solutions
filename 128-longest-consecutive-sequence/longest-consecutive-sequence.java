class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> st = new HashSet<>();

        for (int num : nums) {
            st.add(num);
        }

        int maxLength = 0;

        for (int num : st) {

            // num is the beginning of a sequence
            if (!st.contains(num - 1)) {

                int currNum = num;
                int currLength = 1;

                while (st.contains(currNum + 1)) {
                    currNum++;
                    currLength++;
                }

                maxLength = Math.max(maxLength, currLength);
            }
        }

        return maxLength;
    }
}