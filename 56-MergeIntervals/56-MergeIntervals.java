// Last updated: 9/15/2026, 4:26:19 PM
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {

            if (list.isEmpty() ||
                list.get(list.size() - 1)[1] < interval[0]) {

                list.add(interval);

            } else {

                list.get(list.size() - 1)[1] =
                    Math.max(list.get(list.size() - 1)[1],
                             interval[1]);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}