package com.ct.mock;

public class Sqroot {
	
	// Find square root of a number in less < O(n)
	public static void main(String[] args) {
		
		int n = 25;
		int result = findSqroot(n);
		System.out.println(result);
		
	}
	
	// Optimal - Using Binary search
	// TC O(logn)
	// SC O(1)
	public static int findSqroot(int n) {
		
		int left =1;
		int right = n;
		int ans = 0;
		
		while(left<=right) { // // <= to include the right edge
			
			
			int mid = left +(right-left)/2;
			
			if((long)mid*mid==n) {
				// if perfect square found return mid
				return mid;
				
			}
			
			else if((long)mid*mid<n) {
				
				ans=mid; // update the ans as floor value if perfect square is not found
				left=mid+1; // move right to search for the perfect square
			}
			else {
			// if mid greater move left
				right=mid-1;
			}
					
		}
		
		return ans;
	}

}
