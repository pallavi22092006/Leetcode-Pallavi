// Last updated: 8/13/2026, 11:29:03 AM
class Solution {
    public boolean detectCapitalUse(String word) {

        if (word.equals(word.toUpperCase()))
            return true;

        if (word.equals(word.toLowerCase()))
            return true;

        String first =
                Character.toUpperCase(word.charAt(0))
                + word.substring(1).toLowerCase();

        return word.equals(first);
    }
}