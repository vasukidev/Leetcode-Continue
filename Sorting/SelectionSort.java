package com.ct.sorting;

import java.util.Arrays;

// TC = O(n2) avg worst
// SC = O(1)
// Greedy approach
public class SelectionSort {
	
	public static void main(String[] args) {
		
		int arr [] = {36,48,52,23,9,5};
		
		//selectionSort(arr);
		selectionSortRec(arr, 1, 0);
		System.out.println(Arrays.toString(arr));
		
		
	}
	// iterative approach
	public static int[] selectionSort(int[] arr) {

	    // Outer loop - this loop moves the boundary of the unsorted subarray
	    for (int i = 0; i < arr.length - 1; i++) {
	        
	        // Assume the current index i is the index of the smallest value
	        int min_indx = i;

	        // Inner loop - find the actual smallest value in the rest of the array
	        for (int j = i + 1; j < arr.length; j++) {
	            // If we find an element smaller than the one at min_indx
	            if (arr[j] < arr[min_indx]) {
	                // Update min_indx to this new index
	                min_indx = j;
	            }
	        }

	        // Swap the smallest found element with the element at index i
	        int temp = arr[i];
	        arr[i] = arr[min_indx];
	        arr[min_indx] = temp;
	    }

	    // Return the sorted array
	    return arr;
	}
	
	// recursive approach
	
	public static int [] selectionSortRec(int [] arr, int index, int currentIndex) {
		
		// base cond'n
		// if index is greater than or equal to the length that means there are no elements to swap
		if(index>=arr.length-1)
			return arr;
		
		else {
			// min value can be max positive value in bit
			int min = index;
			
			for(int i = index+1;i<arr.length;i++) {
				if(arr[i]<arr[min]) 
					
					min=i;// keep track of the index of the min element
				
			}
				
				int temp = arr[currentIndex];
				arr[currentIndex] = arr[min];
				arr[min]=temp;
				
			return selectionSortRec(arr, index+1, currentIndex+1);
		}
		
		
	}

}
