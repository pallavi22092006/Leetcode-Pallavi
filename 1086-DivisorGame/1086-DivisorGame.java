// Last updated: 8/13/2026, 11:24:28 AM
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