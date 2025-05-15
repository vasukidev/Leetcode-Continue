package com.ct.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int nums [] = {2,7,11,15};
		
		int target = 17;
		
		int ans [] = twoSum(nums, target);
		
		for(int i =0;i<ans.length;i++) {
			
			System.out.print(ans[i]+" ");
		}
		
	}
	// TC O(n2)
	// SC O(1)
	public static int[] bruteForce(int [] nums, int target) {
		
		int sum = 0;
		
		for(int i =0;i<nums.length;i++) {
			
			for(int j =0;j<nums.length;j++) {
				
				sum = nums[i]+nums[j];
				
				if(sum==target) {
					
					return new int [] {nums[i],nums[j]};
				}
				
			}
		}
		
		return new int [] {};
		
		
	}
	
	// For sorting O(nlogn)
	// for two pointer it's O(n)
	// TC = O(nlogn)
	// SC = O(1) constant
	 public static boolean twoPointer(int[] nums, int target) {
	        // Step 1: Sort the array
	        Arrays.sort(nums); // O(n log n)

	        // Step 2: Initialize two pointers
	        int left = 0;
	        int right = nums.length - 1;

	        // Step 3: Two pointer loop
	        while (left < right) {
	            int sum = nums[left] + nums[right];

	            if (sum == target) {
	                System.out.println("Pair found: " + nums[left] + " + " + nums[right] + " = " + target);
	                return true;
	            } else if (sum < target) {
	                left++; // Need a larger sum
	            } else {
	                right--; // Need a smaller sum
	            }
	        }

	        System.out.println("No pair found.");
	        return false;
	    }
	
	// Optimal TC = O(n) to traverse through the whole array
	// SC = O(n) using hashmap DS
	public static int [] twoSum(int [] arr,int target) {
		
		int n = arr.length;
		
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i =0;i<n;i++) {
			
			int complement = target-arr[i];
			
			
			if(map.containsKey(complement)) {
				
				return new int[] {map.get(complement),i};
			}
			
			// put the element in the hashmap for subsequent searches
			map.put(arr[i], i);
		}
	
		
		// terminates the method by throwing an exception
		throw new IllegalArgumentException("No Two sum solution");
		
		
		
		
		
	}
	


}
