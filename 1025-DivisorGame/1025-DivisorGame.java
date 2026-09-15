// Last updated: 9/15/2026, 4:19:42 PM
class Solution {
    public boolean divisorGame(int n) {
        int i,x=0;
        for(i=0;i<n;i++){
        n=n-x;
        if(n%2==0){
        return true;
        }
        else
        return false;
        }
    return false;
    }
}