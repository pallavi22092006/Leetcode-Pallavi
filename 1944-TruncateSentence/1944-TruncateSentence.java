// Last updated: 8/13/2026, 11:21:23 AM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<k;i++){
            ans.append(words[i]);
            if(i!=k-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}