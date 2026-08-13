// Last updated: 8/13/2026, 11:23:02 AM
class Solution {
    public int subtractProductAndSum(int n) {
         int p=1;
         int sum=0;
        while(n>0){
            int d=n%10;
            p=p*d;
            sum=sum+d;
            n=n/10;
        }
        return p-sum;

        
    }
}