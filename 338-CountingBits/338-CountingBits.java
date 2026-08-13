// Last updated: 8/13/2026, 11:31:18 AM
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++)
            ans[i] = ans[i >> 1] + (i & 1);

        return ans;
    }
}