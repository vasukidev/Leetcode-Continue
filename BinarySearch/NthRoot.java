package com.ct.searching;

public class NthRoot {
	
	public static void main(String[] args) {
		
		int n = 2, m = 9;
		
		int result = finNthRoot(n, m);
		
		System.out.println(result);
		
	}
	
	public static int finNthRoot(int n, int m) {
		
		int low = 1;
		int high = m;
		
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			if(Math.pow(mid, n)==m) {
				
				return mid;
			} else if(Math.pow(mid, n)>m) {
				
				high = mid -1;
			}
			else {
				
				low = mid +1;
			}
		}
		
		
		return -1;
	}

}
