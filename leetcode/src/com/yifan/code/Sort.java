package com.yifan.code;

public class Sort {

	public static void main(String[] args) {
		int []a={1,4,3,2};
		System.out.println(arrayPairSum(a));

	}
    public static int arrayPairSum(int[] nums) {
    	
    	for(int i=0;i<nums.length-1;i++){//ѡ������
    		for(int j=i+1;j<nums.length;j++){
    			if(nums[i]>nums[j]){
    				int x=nums[i];
    				nums[i]=nums[j];
    				nums[j]=x;
    			}
    		}
    	}
    	
    	for(int i=0;i<nums.length-1;i++){//ð������
    		for(int j=nums.length-1;j>i;j--){
    			if(nums[j]<nums[j-1]){
    				int x=nums[j];
    				nums[j]=nums[j-1];
    				nums[j-1]=x;
    			}
    		}
    	}
    	
    	for(int i=1;i<nums.length;i++){//��������     �������һ��������������ȷ�ģ���������һ��
    		int j=i;
    		int target=nums[i];//������Ԫ��
    		
    		//����
    		while(j>0&&target<nums[j]){
    			nums[j]=nums[j-1];
    			j--;
    		}
    		//����
    		nums[j]=target;
    		
    	}
    	
    	
    	
    	
    	
    	int sum=0;//���е���
    	for(int k=0;k<nums.length;k=k+2){
    		sum+=nums[k];
    	}
        return sum;
    }

}
