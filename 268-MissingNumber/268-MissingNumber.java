// Last updated: 8/13/2026, 11:32:01 AM
class Solution {
    public int missingNumber(int[] nums) {
      int sum=0,ans=0;
      int n=nums.length;
       for(int i=0;i<n;i++){
        sum +=nums[i];
       }
        ans=n*(n+1)/2;
        ans =ans-sum;
        return ans;
    }
}