// Last updated: 8/11/2026, 2:47:09 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        long maxdiag=0;
        int area=0;

        for(int[] d:dimensions){
            long diag=1L*d[0]*d[0]+1L*d[1]*d[1];
            int currArea=d[0]*d[1];

            if(diag>maxdiag || (diag==maxdiag && currArea>area)){
                maxdiag=diag;
                area=currArea;
            }
        }
        return area;
    }
}