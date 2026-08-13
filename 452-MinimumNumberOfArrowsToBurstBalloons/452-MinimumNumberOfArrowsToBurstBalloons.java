// Last updated: 8/13/2026, 11:29:53 AM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int n = 0;
        long end = Long.MIN_VALUE;
        for (int[] i : points) {
            if (i[0] <= end) {
            continue;
            }
            else{
                n++;
                end=i[1];
            }
        }
        return n;
    }
}