package com.yifan.code;

public class Sort {

	public static void main(String[] args) {
		int []a={1,4,3,2};
		System.out.println(arrayPairSum(a));

	}
    public static int arrayPairSum(int[] nums) {
    	
    	for(int i=0;i<nums.length-1;i++){//选择排序
    		for(int j=i+1;j<nums.length;j++){
    			if(nums[i]>nums[j]){
    				int x=nums[i];
    				nums[i]=nums[j];
    				nums[j]=x;
    			}
    		}
    	}
    	
    	for(int i=0;i<nums.length-1;i++){//冒泡排序
    		for(int j=nums.length-1;j>i;j--){
    			if(nums[j]<nums[j-1]){
    				int x=nums[j];
    				nums[j]=nums[j-1];
    				nums[j-1]=x;
    			}
    		}
    	}
    	
    	for(int i=1;i<nums.length;i++){//插入排序     ，假设第一个数的排序是正确的，必须假设第一个
    		int j=i;
    		int target=nums[i];//待插入元素
    		
    		//后移
    		while(j>0&&target<nums[j]){
    			nums[j]=nums[j-1];
    			j--;
    		}
    		//插入
    		nums[j]=target;
    		
    	}
    	
    	
    	
    	
    	
    	int sum=0;//进行叠加
    	for(int k=0;k<nums.length;k=k+2){
    		sum+=nums[k];
    	}
        return sum;
    }

}
