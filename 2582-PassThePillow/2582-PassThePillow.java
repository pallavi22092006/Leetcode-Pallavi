// Last updated: 9/15/2026, 4:16:17 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2*(n-1);
        int pass = time%cycle;
        return pass <n ? pass+1 : 2*n-pass-1;
    }
}