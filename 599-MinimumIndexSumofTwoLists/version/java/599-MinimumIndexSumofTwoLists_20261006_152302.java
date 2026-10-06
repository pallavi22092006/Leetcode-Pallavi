// Last updated: 10/6/2026, 3:23:02 PM
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        int min = Integer.MAX_VALUE;
4        List<String> result = new ArrayList<>();
5
6        for (int i = 0; i < list1.length; i++) {
7            for (int j = 0; j < list2.length; j++) {
8
9                if (list1[i].equals(list2[j])) {
10                    int sum = i + j;
11
12                    if (sum < min) {
13                        min = sum;
14                        result.clear();
15                        result.add(list1[i]);
16                    } 
17                    else if (sum == min) {
18                        result.add(list1[i]);
19                    }
20                }
21            }
22        }
23
24        return result.toArray(new String[0]);
25    }
26}