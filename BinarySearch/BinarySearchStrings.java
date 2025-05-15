package com.ct.searching;

public class BinarySearchStrings {
	
	public static void main(String[] args) {
		
		String [] cities = {"Alaska","Bahamas","Cali","Dallas","nyc"};
		// return false because unicode ascii values are different for Uppercase and lower case
		String target = "cali";
		
		boolean result = binarSearchStr(cities, 0, cities.length-1, target);
		
		System.out.println(result);

	}
	
	
	public static boolean binarSearchStr(String [] cities, int left, int right, String target) {
		
		// base cond'n
		if(left>right) return false;
		
		int mid = left + (right-left)/2;
		
		// if we want to ignore the case then it's compareToignore case utility method
		int res = cities[mid].compareTo(target);
		
		if(res==0) {
			
			return true;
		}
		
		else if(res<0) {
			
			 return binarSearchStr(cities, left, mid-1, target);
		}
		
		else {
			
			return binarSearchStr(cities, mid+1, right, target);
		}
		
		
	}

}
