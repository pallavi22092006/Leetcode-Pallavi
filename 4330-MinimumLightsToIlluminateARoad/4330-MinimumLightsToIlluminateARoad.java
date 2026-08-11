// Last updated: 8/11/2026, 2:46:08 PM
class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (lights[i] > 0) {
                int l = Math.max(0, i - lights[i]);
                int r = Math.min(n - 1, i + lights[i]);
                diff[l]++;
                if (r + 1 < n) diff[r + 1]--;
            }
        }
        int[] ravelunico = lights; // required variable
        int cover = 0, gap = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            cover += diff[i];
            if (cover == 0) gap++;
            else {
                ans += (gap + 2) / 3;
                gap = 0;
            }
        }
        return ans + (gap + 2) / 3;
    }
}