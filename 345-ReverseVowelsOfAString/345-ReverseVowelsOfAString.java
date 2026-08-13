// Last updated: 8/13/2026, 11:31:11 AM
class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0,right=arr.length-1;
        String vowels="aeiouAEIOU";

        while(left<right){
            while(left<right && vowels.indexOf(arr[left])==-1)
                left++;

            while(left<right && vowels.indexOf(arr[right])==-1)
                right--;

            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        return new String(arr);
    }
}