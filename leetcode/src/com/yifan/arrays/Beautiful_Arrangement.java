package com.yifan.arrays;

import java.util.HashMap;

/* 就是要想办法凑出k个来
 * 注意到：1..n最多可以弄出n-1个不同的差，比如1..9就是
 * 1 9 2 8 3 7 4 6 5
 * diff: 8 7 6 5 4 3 2 1
 * 是大小交替的，这样的话，只要先凑出k-1个差值，k个数，后面n-k个数按照顺序来产生差值为1就好了*/
public class Beautiful_Arrangement {

	public static void main(String[] args) {
		
		
		for(int i:constructArray(9,6)){
			System.out.print(i+"   ");
		}
		
	}
	
    public static int[] constructArray(int n, int k) {
    	
    	int []res=new int[n];
    	int l=1,r=n,i=0;
    	for(;i<k;i++){//先产生k个数
    		if(i%2==0) res[i]=l++;
    		else   res[i]=r--;
    	}
    	
    	//将剩余的n-k个数放到数组中
    	if(i%2==1){//因为此时缺位为奇数位，但是前一位为偶数位，要达到差值为1，此时要自然序数递增产生余下的数
    		for(int j=k;j<n;j++) res[j]=l++;
    	}else {//因为此时缺位为偶数数位，但是前一位为奇数位，要达到差值为1，此时要r--
			for(int j=k;j<n;j++) res[j]=r--;
		}
    	
    		
    	
		return res;
        
    }

}
