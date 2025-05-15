package com.ct.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
	
	public static void main(String[] args) {
		
		int nums [] = {1,2};
		
		List<Integer> resultList = majorityOptimal(nums);
		
		// just two elements so Time com is as good as constant
		//O(2log2) nlogn = 1 so O(1)
		//Collections.sort(resultList);
		
	    System.out.println(resultList);
		
	}
	
	// brute for approach
	// O(n2)
	// O(n)
	public static List<Integer> majorityElement(int [] nums) {
		int n = nums.length;
		List<Integer> resultList = new ArrayList<Integer>();
		for(int i = 0;i<n;i++) {
			int count = 0;
			for(int j = 0;j<n;j++) {
				
				if(nums[i]==nums[j]) {
					
					count++;
				}
				
				if(count>n/3) {
					
					resultList.add(nums[i]);
				}
				else {
					
					return new ArrayList<Integer>();
				}
			}
		}
		
		return resultList;
	}
	
	
	// through Hashing approach
	// TC O(n)
	// SC O(n) in worst case 
	// generally the lookup in a hashmap is O(1)
	public static List<Integer> majorityHashing(int [] nums){
		
		int n = nums.length;
		List<Integer> resultList = new ArrayList<Integer>();
		Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		
		// iterate through each element and put in the map
		
		for(int i =0;i<n;i++) {
			
			// if map doesn't contain the key the default as 0 
			hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0)+1);
		}
		
		// Iterate through entry in the map and get the values
		// check each value if it's > n/3
		
		for(Map.Entry<Integer, Integer> entry:hashMap.entrySet()) {
			
			// if the element appears n/3 the floor value
			if(entry.getValue()>n/3) {
				
				// the key is the element we need to add to the list and return the list
				resultList.add(entry.getKey());
			}
			
		}
		
		return resultList;
		
	
	}
	// Boyer Moore's Algorithm
	public static List<Integer> majorityOptimal(int [] nums){
		
		int n = nums.length;
		
		List<Integer> resultList = new ArrayList<Integer>();
		
		int candidate1 = Integer.MIN_VALUE;
		int candidate2 = Integer.MIN_VALUE;
		int count1 =0;
		int count2 = 0;
		
		for(int i =0;i<n;i++) {
			
			if(nums[i]==candidate1) {
				count1++;	
              }else if(nums[i]==candidate2) {
	             count2++;
            } else if(count1==0) {
	        candidate1=nums[i];
	          count1++;
                  }
            else if(count2==0) {
            	candidate2=nums[i];
            	count2++;
            }
            else {
            	
            	count1--;
            	count2--;
            }
		}
	
	/*
	 * In the Boyer-Moore Voting Algorithm:
	 * 
	 * The first pass eliminates non-majority elements by canceling out counts.
	 * 
	 * But because this process is based on relative counts, the candidates left
	 * might not actually occur more than ⌊n/3⌋ times.
	 * 
	 * So, the second pass is required to count the actual frequency of those
	 * candidates and confirm they truly satisfy the condition.
	 */
			
			// initialize the counts to 0
			
			count1 =0;count2=0;
			
			for(int num:nums) {
				
				if(num==candidate1) count1++;
				else if(num==candidate2) count2++;
				
		
			}
			
			if(count1>n/3)resultList.add(candidate1);
			if(count2>n/3)resultList.add(candidate2);
			

	
            return resultList;

	}
}
