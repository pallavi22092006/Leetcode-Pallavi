// Last updated: 8/13/2026, 11:34:40 AM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;

            ans.append((char)('A' + columnNumber % 26));

            columnNumber /= 26;
        }

        return ans.reverse().toString();
    }
}