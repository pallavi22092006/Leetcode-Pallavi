// Last updated: 8/13/2026, 11:33:00 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        int i,j;
        Arrays.sort(nums);
        for(i=1;i<n;i++){
            if(nums[i]==nums[i-1])
                return true;
    }
                return false;
    }
}