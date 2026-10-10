class Solution {
    public int maxProfit(int[] prices) {
        int left = 0 ;
        int profit = 0 ; 
        for(int i =1 ; i<prices.length;i++){
            if(prices[left]<prices[i]){
                profit += prices[i]-prices[left];
            }
            left++;
        }
        return profit;
    }
}