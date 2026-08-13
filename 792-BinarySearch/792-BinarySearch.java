// Last updated: 8/13/2026, 11:26:17 AM
class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;
        int low=0,high=n-1;//flag=0;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==target){
              //  flag=1;
                return mid;
             //   break;
            }
            else if(nums[mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
       // if(flag==0)
        return -1;
    }
}