// Last updated: 8/13/2026, 11:35:16 AM
class Solution {
    public int singleNumber(int[] nums) {
        int i,x=0;
        for(i=0;i<nums.length;i++){
           // nums[i]=sc.nextInt();
            x =x^nums[i];
        }
        return x;
    }
}