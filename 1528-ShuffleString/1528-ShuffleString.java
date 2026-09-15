// Last updated: 9/15/2026, 4:17:35 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] ans=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ans[indices[i]]=s.charAt(i);
        }
        return new String(ans);
    }
}