// Last updated: 9/17/2026, 11:24:07 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder str=new StringBuilder();
4        for(char c:s.toCharArray()){
5            if(c!='-')
6               str.append(Character.toUpperCase(c));
7        }
8        StringBuilder result=new StringBuilder();
9        int count=0;
10        for(int i=str.length()-1;i>=0;i--){
11            if(count==k){
12                result.append('-');
13                count=0;
14            }
15            result.append(str.charAt(i));
16            count++;
17        }
18        return result.reverse().toString();
19    }
20}