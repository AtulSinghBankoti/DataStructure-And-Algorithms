package leetcode;

public class Best_Time_To_Buy_And_Sell_Stock {

	 public int maxProfit(int[] prices) {
		 int profit = 0;
		 
		 for(int i=0; i<prices.length; i++) {
			 for(int j=i+1; j<prices.length; j++) {
				 int p = prices[j]-prices[i];
				 if(p > 0 && p > profit) {
					 profit = p;
				 }
			 }
		 }
	        
		return profit; 
	 }
}
