// Last updated: 10/7/2026, 9:54:33 AM
1import java.util.*;
2
3class Solution {
4    public int minimumPairRemoval(int[] nums) {
5        int n = nums.length;
6
7        long[] val = new long[n];
8        int[] prev = new int[n];
9        int[] next = new int[n];
10
11        for (int i = 0; i < n; i++) {
12            val[i] = nums[i];
13            prev[i] = i - 1;
14            next[i] = (i == n - 1) ? -1 : i + 1;
15        }
16
17        TreeSet<Pair> set = new TreeSet<>((a, b) -> {
18            if (a.sum != b.sum)
19                return Long.compare(a.sum, b.sum);
20            return Integer.compare(a.index, b.index);
21        });
22
23        int bad = 0;
24
25        for (int i = 0; i < n - 1; i++) {
26            set.add(new Pair(val[i] + val[i + 1], i));
27
28            if (val[i] > val[i + 1])
29                bad++;
30        }
31
32        int ans = 0;
33
34        while (bad > 0) {
35            Pair pair = set.pollFirst();
36
37            int left = pair.index;
38            int right = next[left];
39
40            int p = prev[left];
41            int r = next[right];
42
43            // Remove pair (p, left)
44            if (p != -1) {
45                set.remove(new Pair(val[p] + val[left], p));
46
47                if (val[p] > val[left])
48                    bad--;
49            }
50
51            // Remove pair (left, right)
52            if (val[left] > val[right])
53                bad--;
54
55            // Remove pair (right, r)
56            if (r != -1) {
57                set.remove(new Pair(val[right] + val[r], right));
58
59                if (val[right] > val[r])
60                    bad--;
61            }
62
63            // Merge right into left
64            val[left] += val[right];
65
66            next[left] = r;
67
68            if (r != -1)
69                prev[r] = left;
70
71            // Add new pair (p, left)
72            if (p != -1) {
73                set.add(new Pair(val[p] + val[left], p));
74
75                if (val[p] > val[left])
76                    bad++;
77            }
78
79            // Add new pair (left, r)
80            if (r != -1) {
81                set.add(new Pair(val[left] + val[r], left));
82
83                if (val[left] > val[r])
84                    bad++;
85            }
86
87            ans++;
88        }
89
90        return ans;
91    }
92
93    static class Pair {
94        long sum;
95        int index;
96
97        Pair(long sum, int index) {
98            this.sum = sum;
99            this.index = index;
100        }
101    }
102}