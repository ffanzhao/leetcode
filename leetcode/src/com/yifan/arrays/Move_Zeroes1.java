package com.yifan.arrays;

import java.util.Arrays;

public class Move_Zeroes1 {
	
	public static void main(String[] args) {
		int []arr={0, 1, 0, 3, 12};
		moveZeroes(arr);
		for(int a: arr){
			System.out.println(a);
		}
			
	}
	public static void moveZeroes(int[] nums) {
	     if(nums.length==0||nums==null){
	    	 return ;
	     }
	     int index=0;
	     for (int i : nums) {
			if(i!=0){
				nums[index++]=i;
			}
			
		 }
	     while (index<nums.length) {
			nums[index++]=0;
		}
    }

	
}
