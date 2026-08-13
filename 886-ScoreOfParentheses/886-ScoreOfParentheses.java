// Last updated: 8/13/2026, 11:25:34 AM
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