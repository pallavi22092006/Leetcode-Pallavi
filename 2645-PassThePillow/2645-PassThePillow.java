// Last updated: 8/11/2026, 2:48:00 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2*(n-1);
        int pass = time%cycle;
        return pass <n ? pass+1 : 2*n-pass-1;
    }
}