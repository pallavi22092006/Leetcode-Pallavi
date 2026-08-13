// Last updated: 8/13/2026, 11:33:28 AM
class Solution {
    public boolean isHappy(int n) {
       int sum,i,d;
       while(n!=1&&n!=4){
        sum=0;
       while(n!=0){
        d=n%10;
        sum=sum+(d*d);
        n /=10;
       }
       n=sum;}
       if(n==1) return true;
       else return false;
    }
}