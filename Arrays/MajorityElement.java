package com.ct.Arrays;

import java.util.HashMap;

// Majority ELement - 1
// 169. Majority Element
public class MajorityElement {
	
	public static void main(String[] args) {
		
	}
	
	// brute for approach
	// TC - O(n2)
	// SC O(1)
	public static int majorityBrute(int [] nums) {
		
		
		int n = nums.length;
		for(int i =0;i<n;i++) {
			int count = 0;
			
			for(int j =0;j<n;j++) {
				
				if(nums[i]==nums[j]) {
					
					count++;
				}
			}
			if(count>n/2) {
				
				return nums[i];
			}
			
		}
		
		// hence there is no element that occurs more than n/2 times 
		return -1;
	}
	
	// TC = O(n)
	// SC = O(n)
	public static int majorityHashing(int nums[]) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int n = nums.length;
		
		for(int num:nums) {
			/*
			 * If num = 4, and map is {3=2, 4=1}:
			 * 
			 * map.getOrDefault(4, 0) returns 1
			 * 
			 * 1 + 1 → 2
			 * 
			 * So count = 2
			 */
			
			// if no is not present it will increment the count +1 and put it in the map
			int count = map.getOrDefault(num, 0)+1;
			map.put(num, count);
			
			// return if count exceeds n/2
			if(count>n/2) {
				
				return num;
			}
		}
		return -1;
	}
	
	// Moore's voting algorithm
	// TC O(n)
	// SC O(1)
	public static int majorityOptimal(int nums[]) {
		
		int votes =1;
		int majority = nums[0];
		
		for(int i =1;i<nums.length;i++) {
			
			if(votes==0) {
				
				votes++;
				
				majority=nums[i];
			}
			
			else if(majority==nums[i]) {
				votes++;	
			}
			else {
				
				votes--;
			}
		}
		
		
		return majority;
		
	}

}
