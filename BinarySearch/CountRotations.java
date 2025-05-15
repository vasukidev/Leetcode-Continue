package com.ct.searching;

public class CountRotations {
	
	
	public static void main(String[] args) {
		
		int arr [] = {3,4,5,6,1,2};
		
		int count = countRotations(arr);
		
		System.out.println(count);
		
		
	           }
	
public static int countRotations(int [] arr) {
		
		int  low = 0;
		int high = arr.length-1;
		
		int ans = Integer.MAX_VALUE;
		
		int index = -1;
		
		while(low<=high) {
			
			int mid = low + (high -low)/2;
			
			
	
			 // if the search space/portion is already sorted
            // then arr[low] will always be less than arr[high]

            if(arr[low]<=arr[high]){
            	
            	index = low;

                ans = Math.min(ans,arr[low]);
                // further no need to apply binary search we stop/break 
                break;
            }
			// sort the portions
			
			if(arr[low]<=arr[mid]) {
				
				
				if(arr[low]<arr[high]) {
				index = low;
				
				ans = arr[low];
				}
				
				low = mid +1;
			}
			
			else {
				
				index = mid;
				
				ans = arr[mid];
				
				high = mid -1;
			}
			
			
		}
		
		return index;
		
	}

}
