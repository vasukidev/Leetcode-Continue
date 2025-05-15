package com.ct.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	public static void main(String[] args) {
		
	}
	
	// brute force approach
	// TC O(n2)
	// SC O(n)
	public static List<List<Integer>> bruteForce(int [] nums){
		
		
		int n = nums.length;
		
		Set<List<Integer>> hashSet = new HashSet<>();
		
		for(int i =0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				
				for(int k =j+1;k<n;k++) {
					
					if(nums[i]+nums[j]+nums[k]==0) {
						
						
						hashSet.add(Arrays.asList(nums[i],nums[j],nums[k]));
						
						
					}
				}
			}
			
			
		}
		
		return new ArrayList<>(hashSet);
		
	}
	
	//
	public static List<List<Integer>> threeSum(int [] nums){
		
		// sort the array
		Arrays.sort(nums);
		
		// sanity checks
		if(nums==null ||nums.length<3) return new ArrayList<>();
		
		HashSet<List<Integer>> result = new HashSet<List<Integer>>();
		
		// we need to go until the 3rd last element only
		for(int i=0;i<nums.length-2;i++) {
			
			
			int left = i+1;
			int right = nums.length-1;
			
			while(left<right) {
			int sum = nums[i]+nums[left]+nums[right];
			
			
			if(sum==0) {
				
				result.add(Arrays.asList(nums[i],nums[left],nums[right]));
				
				// to find more unique triplets
				left++;
				right--;
			}
			
			else if(sum<0) {
				
				left++;
			}
			else {
				
				right--;
			}
			
			
		}
		}
		
		// converting hashset to list 
		return new ArrayList<>(result);
		
	}

}
