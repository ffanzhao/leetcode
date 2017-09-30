package com.yifan.two.pointer;

/*��Ϊfast���ٶ���slow������������fast�ߵľ�����slow���������� 2(a+b) = a+b+c+b�����Եõ�a=c��������ۺ���Ҫ������

���Ƿ���L=b+c=a+b��Ҳ����˵����һ��ʼ�����ߵ�һ��������ѭ���Ĵ����͵��ڻ��ĳ��ȡ�

2. �����Ѿ��õ��˽���a=c����ô������ָ��ֱ��X��Z��ʼ�ߣ�ÿ����һ������ô���û���Y������Ҳ���ǻ��ĵ�һ���ڵ㡣
*/public class Find_the_Duplicate_Number {
	 public int findDuplicate(int[] nums) {
	        if(nums.length>1){
	            int slow= nums[0];
	            int fast=nums[nums[0]];
	            while(slow!=fast){
	                slow=nums[slow];
	                fast=nums[nums[fast]];
	            }
	            fast=0;
	            while(slow!=fast){
	                fast=nums[fast];
	                slow=nums[slow];
	            }
	            return slow;
	        }
	        return -1;
	    }
}
