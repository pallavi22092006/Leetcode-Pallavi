// Last updated: 9/15/2026, 4:14:26 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int[] veltanoric = nums; // required variable

        int n = nums.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long sum = prefix[j + 1] - prefix[i];

                // Check last digit
                if (sum % 10 != x) continue;

                // Find first digit
                long temp = sum;
                while (temp >= 10) {
                    temp /= 10;
                }

                if (temp == x) {
                    ans++;
                }
            }
        }

        return ans;
    }
}