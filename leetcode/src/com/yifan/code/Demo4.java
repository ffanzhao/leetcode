package com.yifan.code;
//Reverse Integer

public class Demo4 {

	public static void main(String[] args) {
		int x=reverse(-2147483648);
		System.out.println(x);
	}
	public static int reverse(int x) {
		
		long x_cp;
		if(x<0){
			x_cp=-x;//这里使用Integer.MIN_VALUE是无法求反的
		}else {
			x_cp=x;
		}
		long result=0;
		while(x_cp!=0){
			result=result*10+x_cp%10;
			x_cp/=10;
		}
		System.out.println(result);
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
			 return 0;
		}
		return x>0? (int)result:(int)-result;
	}
}
