package com.yifan.divide;


		/*ava中有三种移位运算符
		
		<<      :     左移运算符，num << 1,相当于num乘以2
		
		>>      :     右移运算符，num >> 1,相当于num除以2
		
		>>>    :     无符号右移，忽略符号位，空位都以0补齐*/
//integer的最小值，如果取绝对值会溢出，所以需要转换数据类型
public class IntegerTwo {
    public static void main(String[] args) {
		System.out.println(divide(-2147483648,-1));
	}
    public static int divide(int dividend, int divisor) {
    	//求结果的符号
    	int sign=1;
    	if(dividend<0) sign=-sign;
    	if(divisor<0) sign=-sign; 
    	//为了避免求绝对值溢出，所以先转换数据类型
    	long divd=Math.abs((long)dividend);
    	long divs=Math.abs((long)divisor);
    	//如果除数为0,则默认最大值
    	if(divisor==0){
    		return Integer.MAX_VALUE;
    	}
        //被除数为0，则默认结果为0
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
