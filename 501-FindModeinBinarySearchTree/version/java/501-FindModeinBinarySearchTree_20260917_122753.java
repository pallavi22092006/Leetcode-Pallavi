// Last updated: 9/17/2026, 12:27:53 PM
1class Solution {
2    public String convertToBase7(int num) {
3        if(num==0){
4            return "0";
5        }
6        boolean negative = num<0;
7        num=Math.abs(num);
8        StringBuilder result=new  StringBuilder();
9        while(num>0){
10            result.append(num%7);
11            num/=7;
12        }
13        if(negative){
14            result.append("-");
15        }
16        return result.reverse().toString();
17    }
18}