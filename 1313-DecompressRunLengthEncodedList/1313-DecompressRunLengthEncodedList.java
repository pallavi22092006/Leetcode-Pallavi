// Last updated: 9/15/2026, 4:19:00 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;

        // Find total size
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] ans = new int[size];
        int index = 0;

        // Fill array
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq-- > 0) {
                ans[index++] = val;
            }
        }

        return ans;
    }
}