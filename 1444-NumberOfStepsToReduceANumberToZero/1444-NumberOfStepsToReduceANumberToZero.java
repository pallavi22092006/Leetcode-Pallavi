// Last updated: 8/13/2026, 11:22:57 AM
class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        while(num!=0){
            if(num%2==0){
            num /=2;
            step++;
            }
            else{
            num -=1;
            step++;
            }
        }
            return step;
    }
}