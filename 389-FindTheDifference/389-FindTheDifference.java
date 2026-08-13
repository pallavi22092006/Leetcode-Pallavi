// Last updated: 8/13/2026, 11:30:43 AM
class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        for(char c: s.toCharArray())
           ans^=c;
        for(char c:t.toCharArray())
            ans^=c;
        return ans;
    }
}