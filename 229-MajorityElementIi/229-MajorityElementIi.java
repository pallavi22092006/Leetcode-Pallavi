// Last updated: 8/13/2026, 11:32:38 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int count = 1;
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            if (i < n && nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    ans.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        return ans;
    }
}