package com.ct.Arrays;

import java.util.Arrays;

public class ThreeSumclose {
	
	public static void main(String[] args) {
		
	}
	
	public static int threeSumclose(int [] nums, int target) {
		
		Arrays.sort(nums);
		//int resultSum = nums[0]+nums[1]+nums[2];
		int resultSum = 0;
		
		int minDiff = Integer.MAX_VALUE;
		
		for(int i =0;i<nums.length;i++) {
			int left = i+1;
			int right = nums.length-1;
			
			while(left<right) {
				
				int sum = nums[i]+nums[left]+nums[right];
				
				if(sum==target) {
					return target;	
				}
				if(sum<target) {
					
					left++;
				}
				else {
					
					right--;
				}	
				
				int diffTarget = (sum-target);
				
				if(diffTarget<minDiff) {
					
					resultSum=sum;
					minDiff=diffTarget;
				}
			}	
		}
		
		return resultSum;
	}

}
