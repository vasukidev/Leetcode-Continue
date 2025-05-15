package com.ct.sorting;

import java.util.Arrays;

// TC = O(logn) - best,avg
// Worst TC = O(n2)
// SC = O(logn) in iterative approach
// Divide and Conquer


public class QuickSort {
	
	public static void main(String[] args) {
		
		int [] arr = {2, 1, 6, 10, 4, 1, 3, 9, 7 };
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void quickSort(int arr[],int low,int high) {
		
		int start = low;
		int end = high;
		int mid = low+(high-low)/2;
		int pivot = arr[mid];
	
		
		// base cond'n should be there in recursion to avoid stack overflow
		//StackOverflowError	Caused by infinite recursive calls
		// that means we've no elements to compare
		if(low>=high) {
			
			return;
		}
		
		
		// we should always have the main loop where start is <= end index
		
		while(start<=end) {
			
			// all the elements on the left side of the pivot should be less than the p
			
			while(arr[start]<pivot) {
				
				start++;	
			}
			// all the elements on the right side of the pivot should be greater than the p
			while(arr[end]>pivot) {
				
				end--;	
				
			}
			
			// if any of the two while loops violate then swap
			
			if(start<=end) {
				// check start index less than end index
				
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end]= temp;
				// after swapping also we will increment and decrement
				start++;
				end--;
				
				
			}
			
			
		}
		
		// if the ctrl comes out of the above while loop when end<start when they cross each other
		// then divide the other sub array by using recursion below 
		quickSort(arr, low, end);
		// after the left sub array is sorted then the other part of the array
		quickSort(arr, start, high);
	}

}
