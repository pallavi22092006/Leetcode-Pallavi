// Last updated: 9/15/2026, 4:25:07 PM
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums)
            set.add(n);

        int ans = 0;

        for (int n : set) {

            if (!set.contains(n - 1)) {

                int current = n;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                ans = Math.max(ans, length);
            }
        }

        return ans;
    }
}