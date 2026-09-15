// Last updated: 9/15/2026, 4:22:21 PM
import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for (int n : nums) {

            sum += n;

            ans += map.getOrDefault(sum - k, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}