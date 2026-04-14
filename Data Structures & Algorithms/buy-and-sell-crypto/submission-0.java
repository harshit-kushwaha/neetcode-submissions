class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2){
            return 0;
        }

        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++){
            // if this is a transaction -> save the amount, 
            // if profit is more than previos profit.
            if (prices[i] > min && (prices[i] - min) > profit){
                profit = prices[i] - min;
            } else if (prices[i] < min) {
                min = prices[i];
            }

        }

        return profit;
    }
}
