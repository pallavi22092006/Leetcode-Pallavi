// Last updated: 9/15/2026, 4:20:25 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int maxSum = nums[0];
        int currentMax = 0;

        int minSum = nums[0];
        int currentMin = 0;

        for (int n : nums) {

            currentMax = Math.max(n, currentMax + n);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(n, currentMin + n);
            minSum = Math.min(minSum, currentMin);

            total += n;
        }

        if (maxSum < 0)
            return maxSum;

        return Math.max(maxSum, total - minSum);
    }
}