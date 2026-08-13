// Last updated: 8/13/2026, 11:21:17 AM
class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26];

        for (char ch : sentence.toCharArray()) {
            seen[ch - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}