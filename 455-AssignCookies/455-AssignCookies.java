// Last updated: 8/13/2026, 11:29:49 AM
import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i])
                i++;

            j++;
        }

        return i;
    }
}