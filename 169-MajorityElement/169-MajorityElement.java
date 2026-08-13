// Last updated: 8/13/2026, 11:34:35 AM
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int i,c=0,t=0;
        for(i=0;i<n;i++){
            if(c==0)
            t=nums[i];
            if(t==nums[i])c++;
            else c--;
            }
            return t; 
            // Arrays.sort(nums);
        // return nums[n/2];
    }
}