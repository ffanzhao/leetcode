package com.yifan.divide;


		/*ava����������λ�����
		
		<<      :     �����������num << 1,�൱��num����2
		
		>>      :     �����������num >> 1,�൱��num����2
		
		>>>    :     �޷������ƣ����Է���λ����λ����0����*/
//integer����Сֵ�����ȡ����ֵ�������������Ҫת����������
public class IntegerTwo {
    public static void main(String[] args) {
		System.out.println(divide(-2147483648,-1));
	}
    public static int divide(int dividend, int divisor) {
    	//�����ķ���
    	int sign=1;
    	if(dividend<0) sign=-sign;
    	if(divisor<0) sign=-sign; 
    	//Ϊ�˱��������ֵ�����������ת����������
    	long divd=Math.abs((long)dividend);
    	long divs=Math.abs((long)divisor);
    	//�������Ϊ0,��Ĭ�����ֵ
    	if(divisor==0){
    		return Integer.MAX_VALUE;
    	}
        //������Ϊ0����Ĭ�Ͻ��Ϊ0
    	if(dividend==0){
    		return 0;
    	}  	
    	
    	long  c=1;
    	while(divd>divs){  
    		divs = divs<<1;  
            c=c<<1;  
        }  
        int result =0;  
        while(divd>=Math.abs((long) divisor)){  
            while(divd>=divs){  
            	divd = divd - divs;  
                result += c;  
            }  
            divs = divs>>1;  
            c=c>>1;  
        }  
	
		return sign*result;
        
    }

}
