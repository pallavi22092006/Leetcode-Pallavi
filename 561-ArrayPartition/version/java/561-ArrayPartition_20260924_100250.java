// Last updated: 9/24/2026, 10:02:50 AM
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        java.util.Arrays.sort(nums);
4        int sum=0;
5        for(int i=0;i<nums.length;i+=2){
6            sum+=nums[i];
7        }
8        return sum;
9    }
10}