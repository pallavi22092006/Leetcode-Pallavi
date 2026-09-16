// Last updated: 9/16/2026, 9:16:38 AM
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int low = 1;
13        int high = n;
14        
15        while (low <= high) {
16            int mid = low + (high - low) / 2;
17            int res = guess(mid);
18            
19            if (res == 0) {
20                return mid; 
21            } else if (res == 1) {
22                low = mid + 1; 
23            } else {
24                high = mid - 1;  
25            }
26        }
27        
28        return -1;
29    }
30}