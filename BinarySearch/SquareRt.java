package com.ct.searching;

public class SquareRt {
	
	public static void main(String[] args) {
		
		int x = 25;
		
		int result = findSqRt(x);
		
		System.out.println(result);
		
	}
	
	public static int findSqRt(int x) {
		
		 int ans = 0;
			
			int left = 1;
			int right = x; // the  possible ans is the number itself 
			
			while(left<=right) {
				
				int mid = left + (right-left)/2;

	           // if(mid==0) return 0;
				
	            // if x is large then it can be an over flow so make mid as long
				if((long)mid*mid<=x) { // type conversion 
					
					ans = mid; // might be the ans but we are looking for a bigger one 
					
					left = mid +1; // eliminate the left search space if the number is small try bigger
				
				}
				else {
					
					right = mid -1; // eliminate right if the number is  too big try smaller
				}
				
			}
			
			return ans;
		
	}

}
