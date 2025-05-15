package com.ct.mock;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		
		int n = 6;
		
		List<List<Integer>> listOflists = generateTriangle(n);
		// loop to print the values
		for(List<Integer> innerList: listOflists) {
			
			for(int val:innerList) {
				
				System.out.print(val);
			}
			System.out.println();
		}
		
	}
	
	public static List<List<Integer>> generateTriangle(int n){
		
		List<List<Integer>> result = new ArrayList<>();
		
		// base cond'n
		if(n<=0) return result;
		
		List<Integer> firstRow = new ArrayList<Integer>();
		
		firstRow.add(1);
		result.add(firstRow);
		
		// base cond'n
		if(n==1) return result;
		
		// iterate through all the rows to generate triangle
		// triangle is 0 based index and first row is already created
		for(int i=1;i<n;i++) {
			
			List<Integer> prevRow = result.get(i-1);
			
			List<Integer> newRow = new ArrayList<Integer>();
			
			newRow.add(1);
			// because we need to compute sums for i-1 elements
			// if i is the row where i=3 then 3-1=2 so compute 2 sums
			for(int j=0;j<i-1;j++) {
				
				newRow.add(prevRow.get(j) + prevRow.get(j+1));
			}
			newRow.add(1);
			
			result.add(newRow);
		}
		
		
		return result;
		
	}

}
