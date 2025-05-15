package com.ct.searching;

public class BinarySearchRec {
	
	public static void main(String[] args) {
		
        int arr [] = {12,14,15,16,17,20};
        int target = 5;
		
		boolean result = binarySearchRec(arr, 0, arr.length-1, target);
		
		System.out.println(result);
			
	}
	
	
	public static boolean binarySearchRec(int [] arr, int low, int high, int target) {
		
		
		// base cond'n
		if(low>high) return false;
			
			int mid = low+(high-low)/2;
			
			if(arr[mid]==target) {
				
				return true;
			}
			// == is handled so < and > is enough
			else if(arr[mid]<target) {
				
				return binarySearchRec(arr, mid+1, high, target);
			}
			
			else {
				
				return binarySearchRec(arr, low, mid-1,target);
			}
		
		
	
	// no need to return again in the end as each if/else condition is returning	
	}

}
