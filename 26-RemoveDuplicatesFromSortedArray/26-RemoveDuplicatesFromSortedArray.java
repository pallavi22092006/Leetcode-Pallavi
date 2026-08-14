// Last updated: 8/14/2026, 12:03:13 PM
class Solution {
    public int removeDuplicates(int[] nums) {
     int n= nums.length;
     if(n==0) return 0;
     int k=1;
     for(int i=0;i<n;i++){
        if(nums[i]!=nums[k-1]){
            nums[k]=nums[i];
            k++;
        }
     }   
     return k;
    }
}