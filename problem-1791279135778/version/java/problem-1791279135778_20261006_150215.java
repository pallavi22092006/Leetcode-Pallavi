// Last updated: 10/6/2026, 3:02:15 PM
1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        int minRow=m;
4        int minCol=n;
5        for(int[] op:ops){
6            minRow=Math.min(minRow,op[0]);
7            minCol=Math.min(minCol,op[1]);
8        }
9        return minRow*minCol;
10   }
11}