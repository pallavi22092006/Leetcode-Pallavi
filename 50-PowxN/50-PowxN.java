// Last updated: 8/14/2026, 12:02:31 PM
class Solution {
    public double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;

        while (N > 0) {

            if (N % 2 == 1)
                ans *= x;

            x *= x;
            N /= 2;
        }

        return ans;
    }
}