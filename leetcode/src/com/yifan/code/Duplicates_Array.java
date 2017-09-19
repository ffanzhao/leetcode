package com.yifan.code;

import java.util.ArrayList;
import java.util.List;
/*方法1：根据题目要求：给的验证数组最多出现两次相同的数，或者出现一次某个数，
要求不开辟空间，时间复杂度是O(n).因为数组输入的特点 1<=sums[i]<=n,
则可以把原数组当hash表用 ，因为原数组是正数，标为负数表示出现过，
如果遇到负数 就表示第二次出现，就可以找出所有出现过2次的数*/
public class Duplicates_Array {

	public static void main(String[] args) {
		int[] arr={4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(arr));

	}
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
        	int value=Math.abs(nums[i])-1;
        	if(nums[value]>0){
        		nums[value]=-nums[value];
        	}else {
				list.add(Math.abs(nums[i]));
			}
        }
        return list;
    }

}
