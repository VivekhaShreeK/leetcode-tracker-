// Last updated: 7/9/2026, 9:53:33 AM
// class Solution {
//     public int maxProfit(int[] prices) {
//         int mprice = Integer.MAX_VALUE;
//         int mprofit = 0;
//         for (int price : prices) {
//             if (price < mprice) {
//                 mprice = price;
//             }
//             int profit = price - mprice;
//             if (profit > mprofit) {
//                 mprofit = profit;
//             }
//         }
//         return mprofit;
//     }
// }

class Solution{
    public int maxProfit(int[] prices){
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else if(prices[i]-buy>profit){
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
}