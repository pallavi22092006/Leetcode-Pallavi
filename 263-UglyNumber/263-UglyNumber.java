// Last updated: 8/13/2026, 11:32:06 AM
class Solution {
    public boolean isUgly(int n) {
        if(n>0){
            while(n%2==0) n/=2;
            while(n%3==0) n/=3;
            while(n%5==0) n/=5;
            if(n==1) return true;
            else return false;
        }
        else return false;
    }
}