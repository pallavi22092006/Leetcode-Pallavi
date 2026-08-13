// Last updated: 8/13/2026, 11:21:37 AM
class Solution {
    public boolean halvesAreAlike(String s) {
        
        String vowels="aeiouAEIOU";
        int leftcount=0;
        int rightcount=0;
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                leftcount++;
            }
        }
        for(int i=n/2;i<n;i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                rightcount++;
            }
        }
        return leftcount==rightcount;
    }
}