package com.ct.Arrays;

public class SellBuy {
	
	public static void main(String[] args) {
		
		int [] prices = {7,1,5,3,6,4};
		
		int result = calMax(prices);
		
		System.out.println(result);
		
	}
	
	// Brute force 
	public static int calMaxProfit(int [] prices) {
		
		int maxProfit = 0;
		
		for(int i=0;i<prices.length;i++) {
			
			for(int j =i+1;j<prices.length;j++) {
				
				int current_profit = prices[j]-prices[i];
				
				maxProfit=Math.max(maxProfit, current_profit);	
			}

		}
		
		return maxProfit;
	}
	
	
	// Optimal approach
	public static int calMax(int [] prices) {
		
		int maxProfit = Integer.MIN_VALUE;
		int buy_price = prices[0];
		
		for(int i =1;i<prices.length;i++) {
			
			
			if(prices[i]<buy_price) {
				
				buy_price = prices[i];	
			}
			
			else {
				
				int current_profit = prices[i]-buy_price;
				
				maxProfit = Math.max(current_profit, maxProfit);
				
			}
			
			
		}
		if(maxProfit<=0) return 0;
		return maxProfit;
		
	}

}
