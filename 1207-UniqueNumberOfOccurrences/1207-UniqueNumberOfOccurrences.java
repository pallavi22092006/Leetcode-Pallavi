// Last updated: 9/15/2026, 4:18:48 PM
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        // Check if frequencies are unique
        for (int freq : map.values()) {
            if (set.contains(freq)) {
                return false;
            }
            set.add(freq);
        }

        return true;
    }
}