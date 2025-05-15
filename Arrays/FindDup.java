package com.ct.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDup {
	
	public static void main(String[] args) {
		
		
		int [] nums = {3,1,3,4,2};
		
		int result = findDuplicate(nums);
		
		System.out.println(result);
		
	}
	
	// brute force approach extreme naive
	// TC = O(nlogn+n) nlogn for sorting and n for traversing through the array
	// SC = O(1)
	public static int findDuplicate(int [] nums) {
		
		int n = nums.length;
		int ans =0;
		
		Arrays.sort(nums);
		
		for(int i =0;i<n-1;i++) {
			
			
				
				if(nums[i]==nums[i+1]) {
					
					ans = nums[i];
						
				}
		
		}
		return ans;
		
	}
	
	
	// Tc = O(n)
	// SC = O(n) We are using hashing technique using another data structure
	//So total time = n iterations × O(1) operations = O(n)
	public static int findDupHashing(int [] nums) {
		
		int n = nums.length;
		
		int ans = 0;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0;i<n;i++) {
			
			//O(1) average case (due to HashSet's constant-time lookup)
			if(set.contains(nums[i])) {
				
				ans = nums[i];
				
			}
			//also O(1) average case
			set.add(nums[i]);
		    }
		
		return ans;
		
		}
	
	
	// frequency array method
	// Tc O(n)
	// SC O(n)
	public static int findDupFreq(int [] nums) {
		
		int n = nums.length;
		int ans = -1;
		
		int [] freq = new int[n+1];
		
		for(int i = 0;i<n;i++) {
			
			// that means the number has encountered only once
			if(freq[nums[i]]==0) {
				
				// hence we mark it as seen
				freq[nums[i]]=1;
			}
			
			else {
				// found the duplicate
				
				ans= nums[i];
			}
		}
		
		return ans;
	}
	
	// Floyd Warshall's algorithm
	// Tc = O(n)
	// SC = O(1) constant space
	public static int floydWarshall(int nums []) {
		
		int slow = 0,fast=0;
		
		do {
			
			slow = nums[slow];
			fast = nums[nums[fast]];
			
			
		}while(slow!=fast);
		
		fast =0;
		
		while(slow!=fast) {
			
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
			
	}
	
	
	
	}
	

