// Last updated: 8/13/2026, 11:37:29 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3
4        // Make nums1 the smaller array
5        if (nums1.length > nums2.length) {
6            int[] temp = nums1;
7            nums1 = nums2;
8            nums2 = temp;
9        }
10
11        int m = nums1.length;
12        int n = nums2.length;
13
14        int low = 0, high = m;
15
16        while (low <= high) {
17
18            int partition1 = (low + high) / 2;
19            int partition2 = (m + n + 1) / 2 - partition1;
20
21            int left1 = (partition1 == 0)
22                    ? Integer.MIN_VALUE
23                    : nums1[partition1 - 1];
24
25            int right1 = (partition1 == m)
26                    ? Integer.MAX_VALUE
27                    : nums1[partition1];
28
29            int left2 = (partition2 == 0)
30                    ? Integer.MIN_VALUE
31                    : nums2[partition2 - 1];
32
33            int right2 = (partition2 == n)
34                    ? Integer.MAX_VALUE
35                    : nums2[partition2];
36
37            if (left1 <= right2 && left2 <= right1) {
38
39                // Even number of elements
40                if ((m + n) % 2 == 0) {
41                    return (Math.max(left1, left2)
42                            + Math.min(right1, right2)) / 2.0;
43                }
44
45                // Odd number of elements
46                else {
47                    return Math.max(left1, left2);
48                }
49            }
50
51            else if (left1 > right2) {
52                high = partition1 - 1;
53            }
54
55            else {
56                low = partition1 + 1;
57            }
58        }
59
60        return 0.0;
61    }
62}