// Last updated: 9/17/2026, 11:49:57 AM
1class Solution {
2    public String[] findWords(String[] words) {
3        String[] rows = {
4            "qwertyuiop",
5            "asdfghjkl",
6            "zxcvbnm"
7        };
8
9        java.util.ArrayList<String> result = new java.util.ArrayList<>();
10
11        for (String word : words) {
12            String lower = word.toLowerCase();
13            int row = -1;
14
15            for (int i = 0; i < 3; i++) {
16                if (rows[i].indexOf(lower.charAt(0)) != -1) {
17                    row = i;
18                    break;
19                }
20            }
21
22            boolean valid = true;
23
24            for (char ch : lower.toCharArray()) {
25                if (rows[row].indexOf(ch) == -1) {
26                    valid = false;
27                    break;
28                }
29            }
30
31            if (valid) {
32                result.add(word);
33            }
34        }
35
36        return result.toArray(new String[0]);
37    }
38}