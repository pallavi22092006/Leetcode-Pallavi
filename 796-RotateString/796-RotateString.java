// Last updated: 9/15/2026, 4:21:12 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
             return false;

        return (s+s).contains(goal);
    }
}