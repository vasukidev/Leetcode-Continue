package com.ct.Arrays;

public class KadaneAlgo {
	
	// LC 238
	// Max sub array
	// 23rd July 
	// Riddhi's approach
	
	public static void main(String[] args) {
		
		int nums [] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int result = kadaneAlgo(nums);
		
		System.out.println(result);
			
	}
	
	// Naive brute force triple loop
	// capture the max sub array
	public static void max(int [] nums) {
		
		int maxSum = Integer.MIN_VALUE;
		
		int start = 0,end=0;
		
		for(int i = 0;i<nums.length;i++) {
			
			for(int j = i;j<nums.length;j++) {
				
				int currSum =0;
				
				for(int k = i;k<=j;k++) {
					
					currSum+=nums[k];
				}
				
				if(currSum>maxSum) {
					
					maxSum=currSum;
					start=i;
					end=j;
				}
				
			}
		}
		
		System.out.println(" the max sum is "+ maxSum);
		for(int i = start;i<=end;i++) {
			
			System.out.print(nums[i]+ " ");
		}
		System.out.println();
		
		
	}

	// double loop brute force approach
	public static int maxSum(int [] nums) {
		
		int maxSum = Integer.MIN_VALUE;
		
		
		for(int i = 0;i<nums.length;i++) {
			int sum = 0;// reset sum for every starting index 
			// in this double loop brute force we need to try all possible sub arrays 
			for(int j=i;j<nums.length;j++) {
				
				sum+=nums[j];
				/*
				 * if(sum<0) {
				 * 
				 * sum=0;
				 * 
				 * 
				 * }
				 */
				maxSum=Math.max(maxSum, sum);
			}	
			
		}
		
		return maxSum;
		
	}
	
	// Kadane's Optimal approach
	// Only one loop
	public static int kadaneAlgo(int nums []) {
		
		int sum =0;
		int count =0;
		int maxSum = Integer.MIN_VALUE;
		
		/*
		 * negans: Stores the maximum (least negative) value among all negative elements
		 * — used if the array contains only negative numbers.
		 */
		int negans = Integer.MIN_VALUE;
		
		for(int i =0;i<nums.length;i++) {
			
			sum+=nums[i];
			
			if(sum<=0) sum =0;
						
			maxSum = Math.max(maxSum, sum);
			
			if(nums[i]<=0) {
				
				count++;
				/* Update negans to hold the least negative number encountered so far. */
				
				negans=Math.max(negans, nums[i]);
			}
		}
		
		
		if(count==nums.length) {
			
			return negans;
		}
		else
		return maxSum;
	}

}
