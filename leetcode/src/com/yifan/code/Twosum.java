package com.yifan.code;

public class Twosum {
	public static void main(String[] args) {
		int []nums = {2,7,11,15};
		int target=9;
		int arr[]=new int[2];
		try {
			arr=twoSum(nums,target);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int[] twoSum(int[] nums, int target) throws Exception {
		int arr[] = new int [2];
        for(int i=0;i<nums.length;i++){
        	for(int j=i+1;j<nums.length;j++){
        		if(target==nums[i]+nums[j]){
        			arr[0]=i;
        			arr[1]=j;
        			System.out.println(i);
        			System.out.println(j);
        			return arr;
        		}
        	}
        }
	  return null;
    }

}
