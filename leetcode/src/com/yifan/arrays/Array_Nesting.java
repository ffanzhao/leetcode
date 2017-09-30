package com.yifan.arrays;

/*Input: A = [5,4,0,3,1,6,2]
Output: 4
Explanation: 
A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.

One of the longest S[K]:
S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}*/

public class Array_Nesting {
	public static void main(String[] args) {
		int []arr={5,4,0,3,1,6,2};
		System.err.println(arrayNesting(arr));
		
	}
   public static int arrayNesting(int[] nums) {
	   
	   int max=0;
	   
	   for(int i=0;i<nums.length;i++){
		   int count=0;
		   int j=i;
		   while(nums[j]!=i&&nums[j]>0){
			   count++;
			   int x=j;
			   j=nums[j];
			   nums[x]=-1;
		   }
		   if(count>max){
			   max=count;
		   }
	   }
	   
	   return max+1;
        
    }

}
