class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, min = Integer.MAX_VALUE, max = 0;

        for (int price: prices){
            // if new min is found, reset min and max, set min.
            if (price < min){
                min = price;
                max = 0;
            } else if (price > max){
                max = price;
            } else {
                continue;
            }

            if (max > min && (max - min) > res){
                res = max - min;
            }
        }

        return res;
    }
}
