class Solution {
    public int maxProfit(int[] prices) {
        int rightMax=0;
        int maxProfit=0;
        for(int i=prices.length-1;i>=0;i--){
            rightMax=Math.max(rightMax,prices[i]);
            maxProfit=Math.max(maxProfit,rightMax-prices[i]);
        }
        
        return maxProfit;
    }
}
