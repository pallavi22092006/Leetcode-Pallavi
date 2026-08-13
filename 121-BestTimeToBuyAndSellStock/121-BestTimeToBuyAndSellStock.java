// Last updated: 8/13/2026, 11:35:34 AM
class Solution {
    public int maxProfit(int[] prices) {
        int mp= Integer.MAX_VALUE;
        int MP= 0;

        for (int price : prices) {
            if (price < mp) {
                mp = price;
            } else {
                MP= Math.max(MP, price - mp);
            }
        }

        return MP;
    }
}