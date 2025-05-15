package com.ct.searching;

public class SearchRotateII {
	
	public static void main(String[] args) {
		
	}
	
	public static boolean searchRotate(int [] arr, int left , int right , int target) {
		
		
		boolean flag = false;
		
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if(arr[mid]==target) {
				
				return true;
			}
			
			if(arr[left]== arr[mid] && arr[mid] == arr[right]) {
				
				left++;
				right--;
				
				continue;
			}
			
			
			// sort portions
			
			// left portion is sorted or not 
			if(arr[left]<=arr[mid]) {
				
				if(arr[left]<=target && arr[mid]>=target) {
					
					right = mid=1;
				}
				
				else {
					
					left = mid +1;
				}
				
				
			}
			
			// if right portion of the array is sorted 
			else {
				
				if(arr[mid]<= target && arr[right]>= target) {
					
					left = mid +1;
				}
				
				else {
					
					right = mid -1;
				}
				
				
			}
			
			
			
		}
		
		return flag;
	}

}
