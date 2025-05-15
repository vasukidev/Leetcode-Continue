package com.ct.searching;

public class FindMin {
	
	// Striver's solution
	
	public static void main(String[] args) {
		
		
		int arr [] = {3,4,5,1,2};
		
		int ans = findMin(arr);
		
		System.out.println(ans);
	}
	
	
	
	public static int findMin(int [] arr) {
		
		int  low = 0;
		int high = arr.length-1;
		
		int ans = Integer.MAX_VALUE;
		
		while(low<=high) {
			
			int mid = low + (high -low)/2;
			
			
			
			 // if the search space/portion is already sorted
            // then arr[low] will always be less than arr[high]

            if(arr[low]<=arr[high]){

                ans = Math.min(ans,arr[low]);
                // further no need to apply binary search we stop/break 
                break;
            }
			// sort the portions
			
			if(arr[low]<=arr[mid]) {
				
				ans = Math.min(ans, arr[low]);
				
				low = mid +1;
			}
			
			else {
				
				ans = Math.min(ans, arr[mid]);
				
				high = mid -1;
			}
			
			
		}
		
		return ans;
		
	}

}
