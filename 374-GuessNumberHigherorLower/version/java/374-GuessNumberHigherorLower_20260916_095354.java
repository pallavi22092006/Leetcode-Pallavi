// Last updated: 9/16/2026, 9:53:54 AM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] count=new int[128];
4        for(char c:s.toCharArray()){
5            count[c]++;
6        }
7        int length=0;
8        boolean hasOdd=false;
9        for(int n:count){
10            length+=(n/2)*2;
11            if(n%2==1) hasOdd=true;
12        }
13        if(hasOdd) length++;
14        return length;
15    }
16}