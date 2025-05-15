package com.ct.searching;

public class Floor {
	
	// Def: The largest no in the array which is either less than or equal to the target
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,70};
		
		int target = 30;
		
		int res = findFloor(arr, 0, arr.length-1, target);
		
		System.out.println(res);
		

	}
	
	public static int findFloor(int [] arr, int left, int right, int target) {
		
		int ans = -1;
		
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if(arr[mid]<=target) {
				
				ans = arr[mid];
				
				// left moves mid +1 
				
				left = mid +1;
			}
			
			else {
				
				// right moves to mid -1
				
				right = mid -1;
			}
		}
		
		return ans;
	}

}
