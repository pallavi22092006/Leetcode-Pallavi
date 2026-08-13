// Last updated: 8/13/2026, 11:27:01 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;

        for(int n:nums)
            total+=n;

        int left=0;
        for(int i=0;i<nums.length;i++){
            if(left==total-left-nums[i])
                return i;

            left+=nums[i];
        }
        return -1;
    }
}