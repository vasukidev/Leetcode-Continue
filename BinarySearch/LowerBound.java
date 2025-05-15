package com.ct.searching;

public class LowerBound {
	
	// Def: Smallest index such that the element at the index is >= target
	// it's called lower bound because if we have duplicate targets then it returns the lower index
	// follow striver's solution
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,2,4,5,7};
		int target = 6;
		
		int result = lowerBound(arr, 0, arr.length-1, target);	
		System.out.println(result);
		
	}
	
	public static int lowerBound(int [] arr , int left , int right , int target) {
		
		int ans = arr.length;// default/ hypo ans
		
		while(left<=right) {
			
			
			int mid = left + (right-left)/2;
			
			System.out.println(" mid value " + mid);
			
			if(arr[mid]>=target) {
				
				//System.out.println(" get's into if ");
				
				ans = mid; // ans variable gets updated here 
				// move to left part of the array
				right = mid -1;
			}
			else {
				// else move to right part and search
				
				//System.out.println(" get's into else ");
				
				left = mid +1;
				
				
			}
		}
		
	return ans;
		
		
	}

}
