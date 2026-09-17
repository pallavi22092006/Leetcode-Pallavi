// Last updated: 9/17/2026, 11:15:01 AM
1class Solution {
2    public int arrangeCoins(int n) {
3        int row=0;
4        while(n>=row+1){
5            row++;
6            n-=row;
7        }
8        return row;
9    }
10}