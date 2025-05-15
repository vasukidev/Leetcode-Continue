package com.ct.Arrays;

public class SetMatrix {
	
	// nikhil lohia's approach
	
	public static void main(String[] args) {
		int [][] matrix = {{1,2,3},{4,0,6},{7,8,9}};
		
		bruteForce(matrix);
		
		for(int [] row:matrix) {
			
			for(int val:row) {
				
				System.out.println(val+ " ");
			}
		}
		
	}
	
	// brute force approach
	// chat gpt
	// TC O(m*n)
	// SC O(m+n)
	public static void bruteForce(int [][] matrix) {
		// m*n matrix m rows, n cols
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		boolean [] row = new boolean[m];
		boolean [] col = new boolean[n];
		
		for( int i =0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(matrix[i][j]==0) {
					// set markers
					row[i]= true;
					col[i]=true;		
				}	
			}
		}
		
		// based on markers 
		for(int i=0;i<m;i++) {
			
			for(int j =0;j<n;j++) {
				
				if(row[i] || col[j]) {
					
					matrix[i][j]=0;
				}
			}
		}
		
		
	}
	
	
	// TC O(m*n)
	//SC O(1)
	// Optimal approach
	public static void setZeroes(int [][] matrix) {
		
		 boolean firstRow= false, firstCol= false;
			// set markers
			for(int i = 0; i<matrix.length;i++) {
				
				for(int j =0;j<matrix[0].length;j++) {
					
				if(matrix[i][j]==0) {
					
					if(i==0) firstRow=true;
					if(j==0) firstCol = true;
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
				}
				
				
			}
			
			// replace inner matrix
			
			for(int i=1;i<matrix.length;i++) {	
				for(int j =1;j<matrix[0].length;j++) {		
					if(matrix[0][j]==0 || matrix[i][0]==0) {
						
						matrix[i][j]=0;			
					}	
				}
			}
			
			// final checks
			if(firstRow) {
			for(int j =0;j<matrix[0].length;j++) {
				matrix[0][j]=0;	
			}
			}
			
			if(firstCol) {
				for(int i =0;i<matrix.length;i++) {
					matrix[i][0]=0;
				}
				}
		
	}

}
