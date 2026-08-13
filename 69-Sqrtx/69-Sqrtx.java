// Last updated: 8/13/2026, 11:36:51 AM
class Solution {
    public int mySqrt(int x) {
        if (x < 2) 
        return x;  
        int l = 1, r = x / 2, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sq = (long) mid * mid;
            if (sq == x) 
            return mid;
            if (sq < x) {
                ans = mid;  
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
