// Last updated: 10/1/2026, 9:13:22 AM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int m=mat.length;
4        int n=mat[0].length;
5        if(m*n!=r*c) return mat;
6        int[][] result=new int[r][c];
7        for(int i=0;i<m*n;i++){
8            result[i/c][i%c]=mat[i/n][i%n];
9        }
10        return result;
11    }
12}