package com.ct.sorting;

import java.util.Arrays;

public class MergeSort {
	
	// TC O(nlogn) - best,avg,worst
	// SC O(n)
	// Java's in built function Arrays.sort uses merge sort internally for object data types
	// for primitive data types input it uses dual pivot quick sort ( depends on the input ) 
	/*
	 * n = number of elements in the array
	 * 
	 * The array is divided log(n) times (because it’s halved each time),
	 * 
	 * At each level, it takes O(n) time to merge the results.
	 * 
	 *  That gives O(n log n) time complexity across all cases — which is much faster than bubble, insertion, or selection sort for large arrays.
	 *  O(n) extra space is required to store the temporary arrays during the merge process.

        So merge sort is not an in-place sorting algorithm (unlike insertion or selection sort).
	 */
	
	public static void main(String[] args) {
		
		
		int [] arr = {48,36,13,52,19,94,21};
		
		// function call
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void merge(int [] arr, int l, int m, int r) {
		
		// create temp arrays for both left and right 
		int left [] = new int [m-l+1]; // +1 if only one element at 0th index is left
		int right [] = new int [r-m];
		
		// now add both left and right elements to temp from main array
		
		int i=0,j=0,k=l; // Initializing variables here k=l because it should start from where the sub array is ready for sorting
		
		// start filling from main array to temp array on the left
		for(int x=l;x<=m;x++) {
			
			left[i++]=arr[x];
		}
		
		// similarly start filling from main array to temp right array
		
         for(int x=m+1;x<=r;x++) {
			
			right[j++]=arr[x];
		}
         
         
         // put everything into main array finally
         
         i=0;j=0; // initializing i and j 0 to start adding from the beginning to main array with k pointer
         while(i<left.length&&j<right.length) {
        	 
        	if(left[i]<=right[j]) {
        		
        		arr[k++]=left[i++];
        	}
        	else {
        		
        		arr[k++]=right[j++];
        	}	 
        	 
         }
         
         
         // adding all the exhausted or left over elements putting in place from both left and right temp arrays to main array
         while(i<left.length) {
        	 
        	 arr[k++]=left[i++];
         }
         
         while(j<right.length) {
        	 
        	 arr[k++] = right[j++];
         }
		
		
	}
	
	public static void mergeSort(int [] arr, int l , int r) {
		
		
		// when the left index is less than the right then go ahead and find the mid and divide the array
		// because if l==r then no need of further execution
		if(l<r) {
			
			int mid = l+(r-l)/2; // use this formula to avoid overflow
			
			
			// recursively call the left side till the l<r cond is not satisfied
			mergeSort(arr, l, mid);
			// recursively call the right side till the l<r cond is not satisfied
			mergeSort(arr, mid+1, r);
			
			merge(arr, l, mid, r);
		}
		
		
	}

}
