// Last updated: 8/13/2026, 11:29:38 AM
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}