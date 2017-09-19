package com.yifan.code;
//Palindrome Number
public class Demo5 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(1221));
	}
    public static boolean isPalindrome(int x) {
    	
    	if(x<0){
    		return false;
    	}
    	int div=1;
    	while(div<=x/10){//产生一个数据级别的数
    		div*=10;
    	}
    	System.out.println(div);
    	while(x>0){//将所有数字比对完之后，再下结论
    		if(x/div!=x%10){
    			return false;
    		}else {
				x=(x%div)/10;//算出新的x,去掉首尾;
				div/=100;
			}
    	}
        return true;
    }

}
