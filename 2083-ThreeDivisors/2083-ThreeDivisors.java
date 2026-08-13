// Last updated: 8/13/2026, 11:21:06 AM
class Solution {
    public boolean isThree(int n) {
        int root = (int)Math.sqrt(n);
        if (root * root != n) return false;
        for (int i = 2; i <= Math.sqrt(root); i++) {
            if (root % i == 0) return false;
        }
        return root > 1;
    }
}
