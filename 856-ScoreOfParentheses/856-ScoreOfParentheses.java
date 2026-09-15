// Last updated: 9/15/2026, 4:20:52 PM
class Solution {
    public int scoreOfParentheses(String sp) {
        Stack<Integer> st=new Stack<>();
        int s=0;
        for(char c:sp.toCharArray()){
            if(c=='('){
                st.push(s);
                s=0;
            }
            else{
                s=st.pop()+Math.max(2*s,1);
            }
        }
        return s;
    }
}