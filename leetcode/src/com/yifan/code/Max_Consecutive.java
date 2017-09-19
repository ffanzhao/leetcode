package com.yifan.code;

public class Max_Consecutive {

	public static void main(String[] args) {
		int []arr={1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));

	}
	public static int findMaxConsecutiveOnes(int[] nums) {
		
		int count=0,max=0;
		for(int i=0;i<nums.length;i++){
			count=(nums[i]==0)? 0:++count; 
			System.out.println(count);
			max=Math.max(max, count);
		}
		return max;
	        
	}

}
