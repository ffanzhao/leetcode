package com.yifan.arrays;

public class Move_Zeroes {
	
	
	public static void main(String[] args) {
		int []arr={0, 1, 0, 3, 12};
		//moveZeroes(arr);
		for(int a: arr){
			System.out.println(a);
		}
			
	}
    /*public static void moveZeroes(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
        	if(nums[i]==0&&nums[j]!=0){
        		swap(nums,i,j);
        		i++;
        		j--;
        	}else if (nums[j]==0) {
				j--;
			}else {
				i++;	
			}
        	
        	
        }
    }

	private static void swap(int[] nums, int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
*/
}
