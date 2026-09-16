// Last updated: 9/16/2026, 9:44:36 AM
1class Solution {
2    public String toHex(int num) {
3        if (num == 0) {
4            return "0";
5        }
6        StringBuilder result = new StringBuilder();
7        char[] hex = "0123456789abcdef".toCharArray();
8        while (num != 0) {
9            int digit = num & 15;
10            result.append(hex[digit]);
11            num = num >>> 4;
12        }
13        return result.reverse().toString();
14    }
15}