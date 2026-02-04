package arrays.leetcode;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeBuyStock {


    static void main(String[] args) {

    }


    //brute force
      public  static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else {
                int profit = prices[i] - minPrice;

                if(profit>maxProfit) maxProfit=profit;
            }
        }
        return maxProfit;
    }


    //optimised O(1)
      public static int maxProfit2(int[] prices) {

    }
}

