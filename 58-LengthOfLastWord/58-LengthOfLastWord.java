// Last updated: 8/13/2026, 11:37:22 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int length=0,i=s.length()-1;
        while(i>=0&&s.charAt(i)==' '){
            i--;
        }
        while(i>=0&&s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
    }
}