package com.ct.Arrays;

public class ContainerWater {
	
	public static void main(String[] args) {
		
	}
	
	
	public static int maxContainer(int heights []) {
		
		int left = 0;
		int right = heights.length-1;
		
		int maxArea = Integer.MIN_VALUE;
		
		
		// until left is less than right
		
		while(left<right) {
			//The height of the container is limited by the shorter line, because water can’t rise above the shortest side — it would just spill out.
			// Hence the min height
			int area = Math.min(heights[left], heights[right])*(right-left);
			
			maxArea = Math.max(maxArea, area);
			
			if(heights[left]<heights[right]) {
				
				left ++;	
			}
			else {
				
				right--;
			}
		}
		
		return maxArea;
	}

}
