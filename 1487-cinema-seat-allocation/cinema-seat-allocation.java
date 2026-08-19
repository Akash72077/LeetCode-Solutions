class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] s : reservedSeats) {
            map.merge(s[0], 1 << s[1], (a, b) -> a | b);
        }

        int left = 0b0000111100;
        int middle = 0b0011110000;
        int right = 0b1111000000;

        long ans = (long) (n - map.size()) * 2;

        for (int mask : map.values()) {
            boolean l = (mask & left) == 0;
            boolean m = (mask & middle) == 0;
            boolean r = (mask & right) == 0;

            if (l && r)
                ans += 2;
            else if (l || m || r)
                ans++;
        }

        return (int) ans;
    }
}