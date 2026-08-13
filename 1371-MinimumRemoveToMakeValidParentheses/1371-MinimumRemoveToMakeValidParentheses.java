// Last updated: 8/13/2026, 11:23:09 AM
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                st.push(i);
            } else if (arr[i] == ')') {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    arr[i] = '#';
                }
            }
        }

        while (!st.isEmpty()) {
            arr[st.pop()] = '#';
        }

        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            if (c != '#') {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}