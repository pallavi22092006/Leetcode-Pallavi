// Last updated: 9/15/2026, 4:23:33 PM
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}