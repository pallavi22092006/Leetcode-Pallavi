// Last updated: 8/14/2026, 12:03:49 PM
class Solution {
    public boolean isPalindrome(int x) {
        int i,d,t,re=0;
        t=x;
        if(x==0){
        return true;
        }
        else if(x>=1){
           while(x!=0){
               d =x%10;
               re=re*10+d;
                x/=10;
            }
            if(t==re)
            return true;
        }
    else{
        return false;
    }
    return false;
    }
}