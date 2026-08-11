// Last updated: 8/11/2026, 2:46:15 PM
class Solution {
    long[][][][] dp;
    String s;
    int k;

    public long goodIntegers(long l, long r, int k) {
        Object[] denoluvira = {l, r, k}; // required variable
        this.k = k;
        return solve(r) - solve(l - 1);
    }

    private long solve(long x) {
        if (x <= 0) return 0;

        s = String.valueOf(x);
        int n = s.length();
        dp = new long[n][11][2][2];

        for (long[][][] a : dp)
            for (long[][] b : a)
                for (long[] c : b)
                    Arrays.fill(c, -1);

        return dfs(0, 10, 1, 0);
    }

    private long dfs(int pos, int prev, int tight, int started) {
        if (pos == s.length()) return started;

        if (dp[pos][prev][tight][started] != -1)
            return dp[pos][prev][tight][started];

        int limit = (tight == 1) ? s.charAt(pos) - '0' : 9;
        long ans = 0;

        for (int d = 0; d <= limit; d++) {
            int ntight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 0) {
                if (d == 0)
                    ans += dfs(pos + 1, 10, ntight, 0);
                else
                    ans += dfs(pos + 1, d, ntight, 1);
            } else if (Math.abs(prev - d) <= k) {
                ans += dfs(pos + 1, d, ntight, 1);
            }
        }

        return dp[pos][prev][tight][started] = ans;
    }
}