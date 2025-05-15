package com.ct.Arrays;

import java.util.Arrays;

public class RotateImage {
	
	// Nikhil Lohia's approach
	
	public static void main(String[] args) {
		
		int [] []matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		rotate2(matrix);
		
		 for(int i = 0;i<matrix.length;i++) {
			 
			 for(int j =0;j<matrix[0].length;j++) {
				 
				 System.out.print(" "+matrix[i][j]);
			 }
			 
			 System.out.println();
		 }
		
	}
	
	// brute force // TC O(n2) == O(m*n)
	// SC O(n2) == O(m*n) to copy into another matrix
	public static void rotate3(int [][] matrix){
		
		int n = matrix.length;
		
		int ans [][] = new int[n][n];
		
		for(int i =0;i<n;i++) {
			
			for(int j =0;j<n;j++) {
				
				// putting all the swapped elements in ans
				ans[i][j] = matrix[n-1-j][i];
			}
		}
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				
				System.out.print(" "+ ans[i][j]);
			}
			System.out.println();
			
		}
	}
	
	
	// TC O(n2) SC O(1)
	// 4 way swapping layer method
	public static void rotate(int [][] matrix) {
		
		int n = matrix.length;
		
		// first loop starts from through outer layer rows
		
		for(int i = 0;i<(n+1)/2;i++) {
			
			// 2nd loop is  for moving elements only once 
			
			for(int j = 0;j<n/2;j++) {
				
				
				// temp = bottom left
				int temp = matrix[n-1-j][i];
				// bottom left = bottom right
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				// bottom right = top right
				matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
				// top right = top left
				matrix[j][n-1-i]= matrix[i][j];
				// top left = temp
				matrix[i][j] = temp;	
				
			}
			
		}
	}
	
	
	// transpose and reverse 
	// TC O(n2) SC = O(1)
	public static int [][] rotate2(int [] [] matrix) {
		
		int n = matrix.length;
		
		 // Transpose the matrix
	    for (int i = 0; i < n; i++) {
	    	// j +1 ro avoid swapping same elements
	      for (int j = i + 1; j < n; j++) {
	        int temp = matrix[i][j];
	        matrix[i][j] = matrix[j][i];
	        matrix[j][i] = temp;
	      }
	    }
	    
	    // reverse the rows
	    // take the last element of the row and swap with the first element
	    for(int i=0;i<n;i++) {
	    	
	    	for(int j = 0;j<n/2;j++) {
	    		
	    		int temp = matrix[i][j];
	    		matrix[i][j]= matrix[i][n-j-1];
	    		matrix[i][n-j-1]=temp;
	    	}
	    }
	    
	    return matrix;
	}
	

}
