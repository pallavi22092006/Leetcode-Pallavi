// Last updated: 8/11/2026, 2:47:52 PM
public class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int takeOnes = Math.min(numOnes, k);
        int sum = takeOnes;
        k -= takeOnes;

        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;

        int takeNegOnes = Math.min(numNegOnes, k);
        sum -= takeNegOnes;

        return sum;
    }
}
