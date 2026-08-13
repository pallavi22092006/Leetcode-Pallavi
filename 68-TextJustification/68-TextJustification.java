// Last updated: 8/13/2026, 11:36:56 AM
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i;
            int len = 0;

            // Find words that fit in one line
            while (j < words.length &&
                   len + words[j].length() + (j - i) <= maxWidth) {
                len += words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            StringBuilder sb = new StringBuilder();

            // Last line or single word
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1)
                        sb.append(" ");
                }

                while (sb.length() < maxWidth)
                    sb.append(" ");
            }
            // Fully justify
            else {
                int spaces = (maxWidth - len) / gaps;
                int extra = (maxWidth - len) % gaps;

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);

                    if (k < j - 1) {
                        for (int s = 0; s < spaces; s++)
                            sb.append(" ");

                        if (extra > 0) {
                            sb.append(" ");
                            extra--;
                        }
                    }
                }
            }

            result.add(sb.toString());
            i = j;
        }

        return result;
    }
}