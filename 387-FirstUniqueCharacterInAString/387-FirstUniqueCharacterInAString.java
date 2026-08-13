// Last updated: 8/13/2026, 11:30:49 AM
class Solution {
    public int firstUniqChar(String s) {
        int n= s.length();
        int i;
        int freq[] = new int[256];
        for(i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for(i=0;i<n;i++){
            char ch = s.charAt(i);
            if(freq[ch]==1)
            return i;
        }
        return -1;
    }
}