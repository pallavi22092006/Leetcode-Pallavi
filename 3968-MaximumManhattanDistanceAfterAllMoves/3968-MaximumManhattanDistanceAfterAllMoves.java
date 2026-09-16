// Last updated: 9/16/2026, 9:34:36 AM
class Solution {
    public int maxDistance(String moves) {
        int up = 0, down = 0, left = 0, right = 0, wild = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'U') up++;
            else if (ch == 'D') down++;
            else if (ch == 'L') left++;
            else if (ch == 'R') right++;
            else wild++; // '_'
        }

        int x = right - left;
        int y = up - down;

        return Math.abs(x) + Math.abs(y) + wild;
    }
}