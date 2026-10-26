class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, min = Integer.MAX_VALUE;

        for (int price : prices) {
            min = Math.min(min, price);
            res = Math.max(res, price - min);
        }

        return res;
    }
    
}
