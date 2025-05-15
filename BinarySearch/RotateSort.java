package com.ct.searching;

public class RotateSort {
	
	public static void main(String[] args) {
		
		int [] arr = {9,10,11,0,1,2,3,4,5,6,7,8};
		
		int target = 19;
		
		int result = rotatedSorted(arr, 0, arr.length-1, target);
		
		System.out.println("the result is " + result);
		
	}
	
	public static int rotatedSorted(int [] arr, int left , int right, int target) {
		
		
		// base cond'n
		if(left>right) return -1;
		
		// main condn to traverse over the array until the indexes cross
		if(left<=right) {
			
			// compute mid at every iteration to divide the array into two halves
			int mid = left +(right-left)/2;
			
			// handle the first test case 
			if(arr[mid]==target) return mid;
			
			
			// if left half is sorted
			// the left array is sorted when the first element is less than the mid element
			// as we check which part of teh array is sorted 
			if(arr[mid]>=arr[left]) {
				
				// then search in the left sub array
				if(arr[left]<= target && arr[mid]>= target) {
				
				return rotatedSorted(arr, left, mid-1, target);
				}
				
				else {
					// search in the right sub array
					
					return rotatedSorted(arr, mid+1, right, target);
				}
				
				
			}
			// if right half is sorted
			// the below else means that means arr[mid]<=arr[right]
			
			else {
				
				if(arr[mid]<=target && arr[right]>= target) {
					
					// search in the right part of the array
					
					return rotatedSorted(arr, mid+1, right, target);
				}
				
				else {
					
					// search in the left part of the array
					
					return rotatedSorted(arr, left, mid-1, target);
				}
			}
		}
		
		
		return -1;
	}

}
