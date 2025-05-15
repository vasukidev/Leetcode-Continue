package com.ct.searching;

public class SearchRotate {
	
	public static void main(String[] args) {
		
		int [] nums = {4,5,6,7,0,1,2};
		
		int target = 0;
		
		
		int result = search(nums, target, 0, nums.length);
		
		System.out.println(result);
		
	}
	
	
	public static int search(int arr [] , int target , int left, int right) {
		
		int ans = -1;
		
		while(left<=right) {
			
			// compute the mid
			
			int mid = left + (right-left)/2;
			
			if(arr[mid]==target) {
				
				ans = mid;
			}
			
			
			// Identify the sorted portion 
			
			// left sorted portion
			if(arr[left]<=arr[mid]) {
				
				if(arr[left]<= target && arr[mid]>= target) {
					
					right = mid -1;
				}
				
				else {
					
					left = mid +1;
				}
				
				
			}
			
			else {
				
				if(arr[mid]<= target && arr[right]>= target) {
					
					left = mid +1;
				}
				
				else {
					
					right = mid -1;
				}
			}
		}
		
		return ans;
		
	
}
	}

