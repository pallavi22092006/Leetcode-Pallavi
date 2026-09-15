// Last updated: 9/15/2026, 4:14:43 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int digitSum = 0;
        int temp = x;

        // Calculate sum of digits
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        // Check divisibility
        if (x % digitSum == 0) {
            return digitSum;
        } else {
            return -1;
        }
    }
}
