package arrays.leetcode;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeBuyStock {


    static void main(String[] args) {
        int[]arr = {7,1,5,3,6,4};
//        System.out.println(maxProfit(arr));
        System.out.println(maxProfit2(arr));
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

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price:prices){
            minPrice = Math.min(minPrice,price);
            maxProfit = Math.max(maxProfit,price-minPrice);
        }

        return maxProfit;
    }
}

