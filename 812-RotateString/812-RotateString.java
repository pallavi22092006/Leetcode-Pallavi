// Last updated: 8/13/2026, 11:26:02 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
             return false;

        return (s+s).contains(goal);
    }
}