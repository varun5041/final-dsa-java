package Arrayslearn.ArraysLeetcode;

public class BuySellStock {
    static void main(String[] args) {
        int arr[]= {7,1,5,3,6,4};

        System.out.println(BestDayToBuySellStocks(arr));
    }

    private static int BestDayToBuySellStocks(int[] prices) {
        int n=prices.length;
        int MaxProfit=0;
        int BuyingPrice=prices[0];
        for (int i = 1;i<n;i++){
            BuyingPrice=Math.min(BuyingPrice,prices[i]);
            int SellingPrice = prices[i];
            int ProfitifSoldOnThatDay=SellingPrice-BuyingPrice;

            MaxProfit=Math.max(MaxProfit,ProfitifSoldOnThatDay);
        }

        return MaxProfit;
    }


}
