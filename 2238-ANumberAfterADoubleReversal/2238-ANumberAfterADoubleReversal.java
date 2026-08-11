// Last updated: 8/11/2026, 2:48:47 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0,d,temp;
         temp = num;
         while(num!=0){
            d = num%10;
            rev=rev*10+d;
            num /=10;
         }
         int ans =0;
         while(rev!=0){
            d=rev%10;
            ans=ans*10+d;
            rev /= 10;
         }
         if(temp==ans)
         return true;
         else 
         return false;
    }
}