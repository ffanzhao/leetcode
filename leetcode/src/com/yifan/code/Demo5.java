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
    	while(div<=x/10){//����һ�����ݼ������
    		div*=10;
    	}
    	System.out.println(div);
    	while(x>0){//���������ֱȶ���֮�����½���
    		if(x/div!=x%10){
    			return false;
    		}else {
				x=(x%div)/10;//����µ�x,ȥ����β;
				div/=100;
			}
    	}
        return true;
    }

}
