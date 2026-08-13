// Last updated: 8/13/2026, 11:32:12 AM
class Solution {
    public int addDigits(int num) {
        int d;
        while(num>9){
            int sum=0;
            while(num!=0){
                d = num%10;
                sum+=d;
                num/=10;
            }
            num=sum;
        }
        return num;
        //  if (num == 0) return 0;
        // return num % 9 == 0 ? 9 : num % 9;
    }
}