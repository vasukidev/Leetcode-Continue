package com.ct.Arrays;

public class ProductOfArray {
	
	public static void main(String[] args) {
		
	}
	
	
	public static int[] productExcept(int [] nums) {
		
	// create left array to store all the left elements
		
		int left [] = new int[nums.length];
		
		// create right array to store the products of all the right side elements
		
		int right [] = new int[nums.length];
		
		// fill the left array
		
		left[0]=1;
		
		for(int i =1;i<nums.length;i++) {
			left[i] = left[i-1]*nums[i-1];
		}
		
		right[nums.length-1]=1;
		for(int i=nums.length-2;i>-1;i--) {
			
			right[i]=right[i+1]*nums[i+1];
		}
		

		int ans [] = new int[nums.length];
		
		for(int i=0;i<nums.length;i++) {
			
			ans[i] = left[i]*right[i];
		}
          return ans;
}
}
