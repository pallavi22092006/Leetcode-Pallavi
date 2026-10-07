// Last updated: 10/7/2026, 10:01:04 AM
1class Solution {
2    public String[] splitMessage(String message, int limit) {
3        int n = message.length();
4
5        for (int parts = 1; parts <= n; parts++) {
6            int digits = digits(parts);
7
8            // "<i/parts>" needs:
9            // 3 + digits(i) + digits(parts)
10            int base = limit - digits - 3;
11
12            if (base <= 0)
13                continue;
14
15            long capacity = (long) parts * base - sumDigits(parts);
16
17            if (capacity >= n) {
18                String[] ans = new String[parts];
19                int index = 0;
20
21                for (int i = 1; i <= parts; i++) {
22                    String suffix = "<" + i + "/" + parts + ">";
23                    int available = limit - suffix.length();
24
25                    int take = Math.min(available, n - index);
26
27                    ans[i - 1] =
28                        message.substring(index, index + take) + suffix;
29
30                    index += take;
31                }
32
33                return ans;
34            }
35        }
36
37        return new String[0];
38    }
39
40    // Number of digits in x
41    private int digits(int x) {
42        return String.valueOf(x).length();
43    }
44
45    // Sum of number of digits from 1 to n
46    private long sumDigits(int n) {
47        long sum = 0;
48
49        for (int start = 1; start <= n; start *= 10) {
50            int end = start * 10 - 1;
51
52            if (start > n)
53                break;
54
55            int count = Math.min(n, end) - start + 1;
56            sum += (long) count * digits(start);
57
58            if (start > n / 10)
59                break;
60        }
61
62        return sum;
63    }
64}