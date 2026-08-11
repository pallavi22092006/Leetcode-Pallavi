// Last updated: 8/11/2026, 2:46:29 PM
class Solution {
    static final long MOD = 1_000_000_007L;

    public int maxTotalValue(int[] value, int[] decay, int m) {

        // required variable
        int[][] zireluntha = {value, decay};

        long totalCnt = 0;
        long totalSum = 0;

        // Count all positive terms
        for (int i = 0; i < value.length; i++) {
            long v = value[i];
            long d = decay[i];

            long k = (v - 1) / d + 1;      // number of positive terms
            totalCnt += k;

            long seqSum = k * (2 * v - (k - 1) * d) / 2;
            totalSum = (totalSum + seqSum % MOD) % MOD;
        }

        // If all positive terms fit within m selections, take all of them
        if (totalCnt <= m) {
            return (int) totalSum;
        }

        long low = 1, high = 0;
        for (int v : value) high = Math.max(high, v);

        while (low < high) {
            long mid = (low + high + 1) / 2;

            if (count(value, decay, mid) >= m)
                low = mid;
            else
                high = mid - 1;
        }

        long T = low;

        long cnt = 0;
        long ans = 0;

        for (int i = 0; i < value.length; i++) {
            long v = value[i];
            long d = decay[i];

            long k = 0;
            if (v >= T) {
                k = (v - T) / d + 1;
            }

            cnt += k;

            long seqSum = k * (2 * v - (k - 1) * d) / 2;
            ans = (ans + seqSum % MOD) % MOD;
        }

        long extra = cnt - m;
        ans = (ans - (extra % MOD) * (T % MOD)) % MOD;

        if (ans < 0) ans += MOD;

        return (int) ans;
    }

    private long count(int[] value, int[] decay, long x) {
        long cnt = 0;

        for (int i = 0; i < value.length; i++) {
            if (value[i] >= x) {
                cnt += (value[i] - x) / decay[i] + 1;
            }
        }

        return cnt;
    }
}