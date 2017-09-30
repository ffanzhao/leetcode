package com.yifan.arrays;

import java.util.HashMap;

/* ����Ҫ��취�ճ�k����
 * ע�⵽��1..n������Ū��n-1����ͬ�Ĳ����1..9����
 * 1 9 2 8 3 7 4 6 5
 * diff: 8 7 6 5 4 3 2 1
 * �Ǵ�С����ģ������Ļ���ֻҪ�ȴճ�k-1����ֵ��k����������n-k��������˳����������ֵΪ1�ͺ���*/
public class Beautiful_Arrangement {

	public static void main(String[] args) {
		
		
		for(int i:constructArray(9,6)){
			System.out.print(i+"   ");
		}
		
	}
	
    public static int[] constructArray(int n, int k) {
    	
    	int []res=new int[n];
    	int l=1,r=n,i=0;
    	for(;i<k;i++){//�Ȳ���k����
    		if(i%2==0) res[i]=l++;
    		else   res[i]=r--;
    	}
    	
    	//��ʣ���n-k�����ŵ�������
    	if(i%2==1){//��Ϊ��ʱȱλΪ����λ������ǰһλΪż��λ��Ҫ�ﵽ��ֵΪ1����ʱҪ��Ȼ���������������µ���
    		for(int j=k;j<n;j++) res[j]=l++;
    	}else {//��Ϊ��ʱȱλΪż����λ������ǰһλΪ����λ��Ҫ�ﵽ��ֵΪ1����ʱҪr--
			for(int j=k;j<n;j++) res[j]=r--;
		}
    	
    		
    	
		return res;
        
    }

}
