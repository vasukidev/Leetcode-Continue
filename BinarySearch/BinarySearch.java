package com.ct.searching;

public class BinarySearch {
	
	//SC - O(1)
		//TC Average & Worst O(logn)
		//TC Best O(1) if arr[mid] == target
		// Divide and conquer or logerithemic approach
		// should be applied on sorted array
	
	public static void main(String[] args) {
		
		int arr [] = {12,14,15,16,17,20,21,23};
		
		int target = 14;
		
		boolean result = binarySearch(arr, 0, arr.length-1, target);
		
		System.out.println(result);
		
		
	}
	
	public static boolean binarySearch(int arr[], int low,int high, int target) {
		
		int count = 0;
		
		
		
		while(low<=high) {
			count++;
			
			System.out.println(" how many passes " + count);
			
			// recompute the mid every time for every pass
			int mid = low+(high-low)/2;
			
			if(target==arr[mid]) 

				return true;
	
          // search on the right side array of the mid 
			if(arr[mid]<target) {
				
				low = mid+1;
			}
			// search on the left side array of the mid 
			else {
				
				high=mid-1;
			}
		}
		return false;
	}

}
