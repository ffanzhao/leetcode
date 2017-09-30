package com.yifan.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
	 public int majorityElement(int[] nums) {
		 
		 	//方法一 sorting
	        /*Arrays.sort(nums);
	        return nums[nums.length/2];*/
		 	//方法二 hashmap
			/* Map<Integer,Integer> map=new HashMap<>();
		        int res=0;
		        for(int i=0;i<nums.length;i++){
		            if(map.containsKey(nums[i])){
		                map.put(nums[i],map.get(nums[i])+1);
		            }else{
		                map.put(nums[i],1);
		            }
		            if(map.get(nums[i])>nums.length/2){
		                res=nums[i];
		            }
		            
		        }
		        return res;*/
		   //方法三 :Moore voting algorithm
		        int major=0,count=0;
		        for(int i=0;i<nums.length;i++){
		        	if(count ==0){
		        		major=nums[i];
		        	}else if (major==nums[i]) {
						count++;
					}else {
						count --;
					}
		        }
		        return major;
		        
		        
		    }
	 

}
