// Last updated: 9/17/2026, 11:28:46 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count=0;
4        int max=0;
5        for(int num:nums){
6            if(num==1){
7                count++;
8                max=Math.max(max,count);
9            }
10            else count=0;
11        }
12        return max;
13    }
14}