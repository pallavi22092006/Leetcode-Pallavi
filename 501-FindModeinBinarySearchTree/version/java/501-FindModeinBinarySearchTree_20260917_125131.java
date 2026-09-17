// Last updated: 9/17/2026, 12:51:31 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3        char[] arr=s.toCharArray();
4        for(int i=0;i<arr.length;i+=2*k){
5            int left=i;
6            int right=Math.min(i+k-1,arr.length-1);
7
8            while(left<right){
9                char temp=arr[left];
10                arr[left]=arr[right];
11                arr[right]=temp;
12
13                left++;
14                right--;
15            }
16        }
17        return new String(arr);
18    }
19}