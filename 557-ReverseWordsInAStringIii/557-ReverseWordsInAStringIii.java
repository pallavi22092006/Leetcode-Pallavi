// Last updated: 8/13/2026, 11:28:53 AM
class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(String word:words){
            ans.append(new StringBuilder(word).reverse());
            ans.append(" ");
        }
    return ans.toString().trim();
    }
}