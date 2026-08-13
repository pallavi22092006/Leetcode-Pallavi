// Last updated: 8/13/2026, 11:29:07 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
            sum +=i;
        }
        if( num==sum) return true;
        else
        return false;
    }
}