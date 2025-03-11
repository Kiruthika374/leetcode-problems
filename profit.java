class Solution {
    public int maxProfit(int[] prices) {
        int count=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                int result=prices[i]-prices[i-1];
                count=count+result;
            }
        }
        return count;
    }
}
