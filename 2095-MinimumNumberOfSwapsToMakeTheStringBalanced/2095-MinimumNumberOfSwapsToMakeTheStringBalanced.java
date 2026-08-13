// Last updated: 8/13/2026, 11:21:02 AM
class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='['){
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }
                else
                    st.push(ch);
            }
        }
        int unmatched = st.size() / 2;
        return (unmatched + 1) / 2;
    }
}
/*class Solution {
    public int minSwaps(String s) {
        int open = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                }
            }
        }

        return (open + 1) / 2;
    }
}*/


