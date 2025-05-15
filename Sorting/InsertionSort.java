package com.ct.sorting;

import java.util.Arrays;

// TC - O(n) Best Case
// O(n2) avg/worst
// SC - O(1)

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int [] arr = {5,1,6,4,2,3};
		
		//insertionSort(arr);
		
		insertionSortRecur(arr, 0);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] insertionSort(int[] arr) {
		

	    // Outer loop: goes through each element starting from the first index
	    for (int i = 0; i < arr.length - 1; i++) {

	        // Inner loop: compares and swaps the current element backwards
	        for (int j = i + 1; j > 0; j--) {

	            // If the previous element is greater than the current,
	            // we swap them to "insert" the current element into its correct position
	            if (arr[j - 1] > arr[j]) {
	                int temp = arr[j - 1];
	                arr[j - 1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }

	    // After sorting is done, return the sorted array
	    return arr;
	}
	
	public static int[] insertionSortRecur(int[] arr, int currentIndex) {

	    // Base case: if we've reached the end of the array, it's sorted
	    if (currentIndex >= arr.length - 1) {
	        return arr;
	    }

	    // Otherwise, we sort the currentIndex + 1 element into its correct place
	    else {
	        // Start from currentIndex + 1 and move backward,
	        // just like the inner loop in iterative insertion sort
	        for (int j = currentIndex + 1; j > 0; j--) {

	            // Swap if the previous element is greater than the current
	            if (arr[j - 1] > arr[j]) {
	                int temp = arr[j - 1];
	                arr[j - 1] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Recursively call to sort the next part of the array
	        insertionSortRecur(arr, currentIndex + 1);
	    }

	    // Return the sorted array after all recursion completes
	    return arr;
	}


}
