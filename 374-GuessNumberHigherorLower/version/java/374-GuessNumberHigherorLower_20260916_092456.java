// Last updated: 9/16/2026, 9:24:56 AM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> result=new ArrayList<>();
4        for(int h=0;h<12;h++){
5            for(int m=0;m<60;m++){
6                int count=Integer.bitCount(h)+Integer.bitCount(m);
7
8                if(count==turnedOn)
9                 result.add(String.format("%d:%02d",h,m));
10            }
11        }
12        return result;
13    }
14}