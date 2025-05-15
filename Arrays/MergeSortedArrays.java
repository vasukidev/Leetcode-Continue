package com.ct.Arrays;

public class MergeSortedArrays {
	
	// TC = O(n*m)
	//SC = O(1)
	
	/*
	 * You're on the right track, but there's a critical mistake that's causing
	 * incorrect results in your second array (arr2): you're casting long values to
	 * int, which leads to data truncation and possibly unexpected behavior.
	 */	
	
	/*
	 * arr2 is declared as a long[], but you're assigning (int) values into it. This
	 * cast may result in loss of precision or incorrect sorting when large numbers
	 * are involved.
	 */
	public static void main(String[] args) {
		
		long [] arr1 = {5,7,14};
		int n = arr1.length;
		long [] arr2 = {1,3,9,10};
		int m = arr2.length;
		
		merge(arr1, n, arr2, m);
		
		
	}
	
	// Approach 1: Swap and sort
	public static void merge(long [] arr1, int n, long [] arr2, int m ) {
		
		// traverse through arr1 to check if there are any big elements to swap with arr2 that has small elements
		// because arr1 should have small elements 
		
		// we will check all the elements of arr1 only with the first element of arr2 
		
		
		for(int i = 0;i<n;i++) {
			
			if(arr1[i]>arr2[0]) {
				// if found then swap
				long temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0]=temp;	
			}
			
			
			int j =0;
			// store the first element of arr2 after the swap to reposition it
			long first = arr2[0];
			// check index should be less than the length
			// and elements in the array should be less than first to reposition first
			for(j=1;j<m && arr2[j]<first;j++) {
				
				arr2[j-1]=arr2[j];	
			}
			arr2[j-1]=(int)first;
		}
		
		for(int k=0;k<n;k++) {
			
			System.out.print(arr1[k]+" ");
		}
		
		System.out.println();
		for(int l =0;l<m;l++) {
			
			
			System.out.print(arr2[l]+ " ");
		}
		
	}

}
