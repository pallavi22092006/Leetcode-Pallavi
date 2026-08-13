// Last updated: 8/13/2026, 11:34:32 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }

        return ans;
    }
}