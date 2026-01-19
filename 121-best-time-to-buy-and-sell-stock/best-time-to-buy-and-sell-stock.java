class Solution {
    public int maxProfit(int[] prices) {
        // int max=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int curr=prices[j]-prices[i];
        //          max=Math.max(curr,max);
        //     }
        // }
        // return  max;

        int buy = prices[0];
        int profit = 0;
        for (int i = 1;i<prices.length;i++) {
            if (prices[i]<buy) {
                buy=prices[i];
            } else if(prices[i]-buy>profit) {
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
}