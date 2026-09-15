// Last updated: 9/15/2026, 4:19:57 PM
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int maxLen = 1, curr = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((i >= 2 && arr[i] > arr[i - 1] && arr[i - 1] < arr[i - 2]) ||
                (i >= 2 && arr[i] < arr[i - 1] && arr[i - 1] > arr[i - 2])) {
                curr++;
            } else if (arr[i] != arr[i - 1]) {
                curr = 2;
            } else {
                curr = 1;
            }

            maxLen = Math.max(maxLen, curr);
        }

        return maxLen;
    }
}