class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int res = 0;
        for(int i =1;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }else{
                res = Math.max(res,prices[i]-buy);
            }
        }
        return res;
    }
}