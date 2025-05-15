package com.ct.searching;

public class UpperBound {
	
	public static void main(String[] args) {
		
		int [] arr = {2,3,6,7,8,8,9,10};
		int target = 7;
		
		int result = upperBound(arr, 0, arr.length-1, target);
		
		System.out.println(result);
		
	}
	
	
	public static int upperBound(int arr [], int left, int right, int target) {
		
		
		int ans = arr.length;
		
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if(arr[mid]>target) {
				
				ans = mid;
				
				right = mid-1;
				
				
			}
			else {
				
				left = mid +1;
			}
		}
		
		return ans;
		
		
	}

}
