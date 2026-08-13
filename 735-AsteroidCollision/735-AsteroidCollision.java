// Last updated: 8/13/2026, 11:26:47 AM
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {

            while (!st.isEmpty() && a < 0 && st.peek() > 0) {

                if (st.peek() < -a) {
                    st.pop(); // right asteroid explodes
                }
                else if (st.peek() == -a) {
                    st.pop(); // both explode
                    a = 0;
                    break;
                }
                else {
                    a = 0; // current asteroid explodes
                    break;
                }
            }

            if (a != 0) {
                st.push(a);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}