// Last updated: 9/15/2026, 4:18:27 PM
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