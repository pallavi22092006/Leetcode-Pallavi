// Last updated: 10/6/2026, 10:39:22 AM
1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums);
4        int max = 0;
5        int left = 0;
6        for (int right = 0; right < nums.length; right++) {
7            while (nums[right] - nums[left] > 1) {
8                left++;
9            }
10            if (nums[right] - nums[left] == 1) {
11                max = Math.max(max, right - left + 1);
12            }
13        }
14        return max;
15    }
16}