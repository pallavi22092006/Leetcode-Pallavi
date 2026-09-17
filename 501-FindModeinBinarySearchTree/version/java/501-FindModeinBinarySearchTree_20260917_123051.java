// Last updated: 9/17/2026, 12:30:51 PM
1class Solution {
2    public int findLUSlength(String a, String b) {
3        if(a.equals(b)) return -1;
4        return Math.max(a.length(),b.length());
5    }
6}