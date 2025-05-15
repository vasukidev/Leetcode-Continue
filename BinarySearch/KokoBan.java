package com.ct.searching;

public class KokoBan {
	
	public static void main(String[] args) {
		
		int piles [] = {3,6,7,11};
		int h = 8;
		
		System.out.println(minEatingSpeed(piles, h));
		
	}
	
	public static int minEatingSpeed(int piles[],int h) {
		
		int low = 0;
		int high = piles[0]; 
		int ans = 0;
		
		// get the highest pile for high value in the binary search 
		for(int pile:piles) {
			
			high = Math.max(pile, high);
				
		}
		
		System.out.println("the highest value " + h);
		
		// apply BS
		
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			if(helper(piles, mid)<=(long)h) {
				
				high = mid -1;
				ans = mid;
			}
			
			else {
				
				low = mid + 1;
			}
			
			
		}
		
		return ans;
	}
	
	// calculate the no of hrs for each pile and total the hrs
	public static long helper(int piles[],int mid) {
		
		long hrs = 0;
		
		for(int pile:piles) {
			
			hrs+=(pile/mid);
			// like 3/3 = 1, 6/3 = 2
			if(pile%mid>0) {
				
				hrs++;
			}
		}
		
		return hrs;
	}

}
