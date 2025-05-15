package com.ct.searching;

public class SearchMatrix {
	
	
	public static void main(String[] args) {
		
		
		int matrix [] [] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		
		
		
		int target = 166;
		
		boolean flag = SearchMtarix(matrix, target);
		
		System.out.println(flag);
		
		
	
	}
	
	public static boolean SearchMtarix(int [][] matrix, int target) {
		
		int rowIndx = searchPotentialRow(matrix, target);
		
		System.out.println(" the rowindex is " + rowIndx);
		
		if(rowIndx!=-1) {
			return 	searchOnRow(matrix, target, rowIndx);
		}
		
		
		else {
			return false;
		}
			
	}
	
	public static int searchPotentialRow(int [][] matrix, int target) {
		
		int low = 0;
		int high = matrix.length-1;
		

		
		// apply bs on the first column
		
		while(low<=high) {
			
			int mid = low + (high-low)/2; // to avoid overflow
			
			System.out.println(" value: " + matrix[mid][0]);
			System.out.println(" value : " + matrix[mid][matrix[0].length-1]);
			
			
			
			if(matrix[mid][0]<= target && target <= matrix[mid][matrix[0].length-1]) {
				
				System.out.println("potential row index value " + mid);
				
				return mid;
				
				
			} else if(matrix[mid][0] < target){
				
				low = mid +1;
				
				
			} else if(matrix[mid][0] > target){
				
				
				high = mid -1;
			}

				
			
		
		}
		
		// default value 
		return -1;
		
		
	}
	
	
	public static boolean searchOnRow(int matrix[][],int target, int rowIndx) {
		
		
		int low = 0;
		int high = matrix[rowIndx].length-1;
		
		while(low<=high) {
			
			int mid = low+ (high-low)/2;
			
			
			if(matrix[rowIndx][mid]== target) return true;
			
			else if(matrix[rowIndx][mid] < target) {
				
				low = mid +1;
			} else if(matrix[rowIndx][mid]> target) {
				
				high = mid-1;
			}
		}
		
		return false;
		
	}

}
