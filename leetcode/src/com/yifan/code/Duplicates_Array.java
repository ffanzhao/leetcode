package com.yifan.code;

import java.util.ArrayList;
import java.util.List;
/*����1��������ĿҪ�󣺸�����֤����������������ͬ���������߳���һ��ĳ������
Ҫ�󲻿��ٿռ䣬ʱ�临�Ӷ���O(n).��Ϊ����������ص� 1<=sums[i]<=n,
����԰�ԭ���鵱hash���� ����Ϊԭ��������������Ϊ������ʾ���ֹ���
����������� �ͱ�ʾ�ڶ��γ��֣��Ϳ����ҳ����г��ֹ�2�ε���*/
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
