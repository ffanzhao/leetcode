package com.yifan.code;
/*【函数说明】atoi() 函数会扫描 str 字符串，跳过前面的空白字符（例如空格，tab缩进等），直到遇上数字或正负符号才开始做转换，而再遇到非数字或字符串结束时('\0')才结束转换，并将结果返回。
【返回值】返回转换后的整型数；如果 str 不能转换成 int 或者 str 为空字符串，那么将返回 0。如果超出Integer的范围，将会返回Integer最大值或者最小值。
【处理思路】按照函数说明来一步步处理。首先判断输入是否为null。然后使用trim()函数删掉空格。判断是否有正负号，做一个标记。返回的是整形数，可以使用double来暂存结果。
按位来计算出结果。如果遇到非数字字符，则返回当前结果。加上前面的正负号。结果若超出了整形范围，则返回最大或最小值。最后返回处理结果。
*/
public class Solution {
	  public int myAtoi(String str) {
		  int max=Integer.MAX_VALUE;
		 
		  int min=-Integer.MIN_VALUE;
		 
		  long result=0;
		  str=str.trim();
		  int len=str.length();
		  int start=0;
		  int sign=0;//1时为正号，2时为负号，0位默认正数
		  if(len<1){
			  return 0;
		  }
		  if(str.charAt(start)=='-'){
		
			  sign=2;
			  start++;
			 
		  }else if (str.charAt(start)=='+') {
			  sign=1;
			  start++;
		  }
		  
		  for(int i=start;i<len;i++){
			  char c=str.charAt(i);
			  //这里应该如果是多符号直接退出，说明不符合数字规范
			  if(c<'0'||c>'9')
			  {
				 break;  
			  }	 
			  if(c>='0'&&c<='9'){  
				  //现在计算出来的结果是没有符号的，注意下面与最小min的比较
				  result =result*10+(c-'0');
			  }
			  //随时判别是否溢出
			  if((sign==1||sign==0)&&result>=max){
				
				  return max;
			  }
			
			  if(sign==2&&-result<-min){
				
				  return min;
			  }
		  }
		  if(sign==2){
			
			  return -(int)result;
		  }
		
	      return (int)result;
	    }
	public static void main(String[] args) {
		System.out.println(new Solution().myAtoi("2147483649"));
		 /*System.out.println(Integer.MAX_VALUE);
		 System.out.println(Integer.MIN_VALUE);*/
		 
	}

}
