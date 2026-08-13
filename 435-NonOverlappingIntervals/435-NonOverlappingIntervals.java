// Last updated: 8/13/2026, 11:30:03 AM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[1]==b[1]? b[0]-a[0]:a[1]-b[1]);
        int c=0;
        int end=Integer.MIN_VALUE;
        for(int[] ele: intervals){
            // ele start > end 
            if(ele[0]>=end)
            end = ele[1];
            //else count increment
            else c++;
        }
        return c;
    }
}