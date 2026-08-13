// Last updated: 8/13/2026, 11:31:20 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1)
        return false;
        while(n%4==0){
            n /=4;
        }
        if(n==1){
            return true;
        }
        else
        return false;
    }
}