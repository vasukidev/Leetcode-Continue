package com.ct.sorting;

import java.util.Arrays;

// TC -  avg/worst O(n2) Best - O(n)
// SC - O(1) no extra array/ ds used
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {15,20,10,25,5};
		
		int[] arr1 = {5,2};
		
		String [] str = {"Seattle","California","Dallas","nyc"};
		
		//bubblesort(arr);
		
		
		
		
		
		//bubblesortString(str);
		bubblesortRecursive(arr, 0);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	// O(n2)
	public static int [] bubblesort(int [] arr) {
		
		for(int i = 0;i<arr.length;i++) {
			
			for(int j = 0;j<arr.length-1;j++) {
				
				// for descending just change <
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		
		
		return arr;
	}
	
	// O(n)
public static int [] bubblesortBest(int [] arr) {
		
		for(int i = 0;i<arr.length;i++) {
			
			int swaps = 0;
			
			for(int j = 0;j<arr.length-1;j++) {
				
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
					swaps ++;
					
				}
			}
			
			if(swaps==0 && i==0) {
				
				System.out.println(" Array is sorted in Best time complexity O(n)");
				break;
			}
		}
		
		
		return arr;
	}

// input String
public static String [] bubblesortString(String [] arr) {
	
	for(int i = 0;i<arr.length-1;i++) {
		
		
		
		//- i ensures we don’t compare already sorted elements at the end of the array in each pass.
		for(int j = 0;j<arr.length-1-i;j++) {
			
			// if any string has upper case then it'll print first because upper case comes before lowercase in unicode
			//  compare To() prints alphabetically ascending order 
			int res = arr[j].compareTo(arr[j+1]); // returns -ve is current is smaller than the other +ve other way and 0 if equal
			
			if(res>0) {
				
				//System.out.println(res);
				
				String temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
			}
				
		}
	}
	
	
	return arr;
}

// Recursive
public static void bubblesortRecursive(int arr [], int index) {
	
	// base cond'n in recursive approach
	if(index>arr.length-1) {
		
		return;
	}
	
	for(int i = 0;i<arr.length-1;i++) {
		
		if(arr[i]>arr[i+1]) {
		
		int temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = temp;
		}
	}
	
	bubblesortRecursive(arr, index+1);
	
	
}

}
