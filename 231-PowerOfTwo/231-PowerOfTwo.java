// Last updated: 8/13/2026, 11:32:34 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
       
        if(n<1) 
        return false;
        while(n%2==0){
               n /=2; 
        }
        if(n==1){
           return true;
        }
        else 
           return false;
        //   return n > 0 && (n & (n - 1)) == 0;
    }
}