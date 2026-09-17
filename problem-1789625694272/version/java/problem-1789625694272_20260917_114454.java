// Last updated: 9/17/2026, 11:44:54 AM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int total =0;
4        for(int i=0;i<timeSeries.length-1;i++){
5            total+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
6        }
7        if(timeSeries.length>0) total+=duration;
8        return total;
9    }
10}