class Solution {
    public int maxProfit(int[] prices) {
        int max=prices.length-1,price=0;
        for(int i=prices.length-2;i>=0;i--){
            max=prices[i]>prices[max]?i:max;
            // price=Math.max(prices[max]-prices[i],price);
            System.out.println(price);
        }
        return price;
    }
}