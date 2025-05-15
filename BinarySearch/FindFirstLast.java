package com.ct.searching;

import java.util.HashMap;
import java.util.Map;

// find first and last occurrences 
// Leetcode 34

public class FindFirstLast {
	
	public static void main(String[] args) {
		
		//brute force O(n)
		
        int arr [] = {2,4,6,8,8,8,11,13};
		
		int first = -1;
		int last = -1;
		int target = 8;
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				
				if(first==-1) {
					// update the element's first occurrence 
					first=i;
				}
				// last always get's updated with last index
				last=i;
			}

		
		
	}
		
		System.out.println(" the first and last occurences :" + first +" "+last );
		
		// 2nd approach 
		
		
		int lb = findLb(arr, 0, arr.length-1, target);
		int ub = findUB(arr, 0, arr.length-1, target);
		
		
		
		
	}
	
	// O(logn) binary search approach using lower bound and upper bound concepts
	
	
	//1. first find lowerboud i.e. the largest index  which is smaller than the target element
	
	
	public static int findLb(int arr [], int left , int right , int target) {
		
		int ans = -1;
		
		
		// iterative approach 
		
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if(arr[mid]>=target) {
				ans = mid;
				right=mid-1;	
			}
			
			else {
				
				left = mid +1;
			}
				
				
			}
		
		return ans;
	}
	
	public static int findUB(int arr[],int left, int right , int target) {
		
		int ans = -1;
		
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if(arr[mid]>target) {
				
				ans = mid;
				
				right=mid-1;
			}
			
			else {
				
				left = mid+1;
			}
		}
		
		return ans;
	}
	
	
	
	public static Map<Integer,Integer> getOcc(int [] arr, int target){
		
		int lb = findLb(arr, 0, arr.length-1,target );
		
		int ub = findUB(arr, 0, arr.length-1, target);
		Map map = new HashMap<Integer, Integer>();
		
		
		// if lb is equal to length and not equals to target
		if(lb==arr.length || arr[lb]!= target) {	
			map.put(-1, -1);		
		}
		
		else {
			
			map.put(lb, ub-1);		
		}
		return map;
	}
	

	
	
}
	


