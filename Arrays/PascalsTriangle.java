package com.ct.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		
	}
	
	public static List<List<Integer>> generate(int numRows){
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(numRows==0) return result;
		
		List<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1); // 1st element in 1st row 
		
		result.add(firstRow);
		
		if(numRows==1) return result;
		
		// Loop to generate rows from the second row (index 1) to the last.
		// as the first row was manually added above 
		for(int i=1;i<numRows;i++) {	
			
			// Get the previous row from the result to use in building the current row.
			List<Integer> prevRow = result.get(i-1);
			//Create a new row and start it with 1 (every Pascal's Triangle row starts with 1).
			ArrayList<Integer> row = new ArrayList<Integer>();
			row.add(1);
			
			/*
			 * This loop builds the "middle" of the row:
			 * 
			 * Each element is the sum of two elements directly above it in the previous
			 * row:
			 * 
			 * prevRow[j] + prevRow[j+1]
			 * 
			 * This only runs if the current row has more than 2 elements.
			 */
			for(int j =0;j<i-1;j++) {
				// get previous row elements to add in the current row 	
				row.add(prevRow.get(j)+prevRow.get(j+1));	
			}
			
			row.add(1);
			result.add(row);
		}
		
		return result;
		
	}

}
