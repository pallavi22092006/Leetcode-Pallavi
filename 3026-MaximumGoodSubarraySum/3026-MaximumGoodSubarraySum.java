// Last updated: 9/15/2026, 4:15:01 PM
import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Long, Long> map = new HashMap<>();

        long prefix = 0;
        long ans = Long.MIN_VALUE;

        for (int x : nums) {

            long value = x;

            if (map.containsKey(value - k)) {
                ans = Math.max(ans,
                        prefix + x - map.get(value - k));
            }

            if (map.containsKey(value + k)) {
                ans = Math.max(ans,
                        prefix + x - map.get(value + k));
            }

            map.put(value,
                    Math.min(map.getOrDefault(value, Long.MAX_VALUE),
                             prefix));

            prefix += x;
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}