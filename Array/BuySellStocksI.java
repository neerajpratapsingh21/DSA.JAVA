package array;

public class BuySellStocksI {
    public static int BuyandSellStocks(int prices[]){
      
        int maxprofit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
          int profit=prices[i]-buy;
        maxprofit=Math.max(maxprofit, profit);
         buy=Math.min(prices[i], buy);
        }
        return maxprofit;
        }
        
    
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
    int result=    BuyandSellStocks(prices);
System.out.println(result);
    }
}
