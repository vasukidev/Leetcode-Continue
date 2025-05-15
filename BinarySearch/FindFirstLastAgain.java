package com.ct.searching;

public class FindFirstLastAgain {
	
	public static void main(String[] args) {
		
	int [] nums = {5,7,7,8,8,10};
				
	int target = 8;
		
	}
	
	public static int [] getOccurrence(int [] arr, int target) {
		
		int [] nums = new int[2];
		
		int first = findFirst(arr, 0, arr.length-1, target);
		
		int last = findLast(arr, 0, arr.length-1, target);
		
		nums[0] = first;
		nums[1] = last;
		
		return nums;
		
		
		
		
	}
	
	
	// find first 
	public static int findFirst(int [] arr, int left , int right, int target) {
		
		int first = -1;
		
		while(left<=right) {
			
			
			int mid = left +(right-left)/2;
			
			if(arr[mid]==target) {
				
				first = -1;
				
				// move left to find the first occ
				
				right = left -1;
				
				
			}
			
			else if(arr[mid]<target) {
				
				left = mid +1;
			}
			
			
			// if arr[mid]> target
			else {
				
				right = mid -1;
			}
		}
		
		return first;
		
	}
	
	
	// find last
	
	public static int findLast(int [] arr, int left , int right , int target) {
		
		int last = -1;
		
		while(left<=right) {
			
			int mid = left +(right-left)/2;
			
			
			if(arr[mid]==target) {
				
				last = mid;
				
				// move right to find the last occ
				left = mid +1;

			}
			
			else if (arr[mid]< target) {

				left = mid +1;
			}
			
			else {
				
				right = mid -1;
			
			}
		}
		
		return last;
	}

}
