// Last updated: 8/13/2026, 11:33:57 AM
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n!=0){
           n=n&n-1;
           c++;
        }
        return c;
    }
}