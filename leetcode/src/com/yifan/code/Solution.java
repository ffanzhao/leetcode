package com.yifan.code;
/*������˵����atoi() ������ɨ�� str �ַ���������ǰ��Ŀհ��ַ�������ո�tab�����ȣ���ֱ���������ֻ��������Ųſ�ʼ��ת�����������������ֻ��ַ�������ʱ('\0')�Ž���ת��������������ء�
������ֵ������ת���������������� str ����ת���� int ���� str Ϊ���ַ�������ô������ 0���������Integer�ķ�Χ�����᷵��Integer���ֵ������Сֵ��
������˼·�����պ���˵����һ�������������ж������Ƿ�Ϊnull��Ȼ��ʹ��trim()����ɾ���ո��ж��Ƿ��������ţ���һ����ǡ����ص���������������ʹ��double���ݴ�����
��λ��������������������������ַ����򷵻ص�ǰ���������ǰ��������š���������������η�Χ���򷵻�������Сֵ����󷵻ش�������
*/
public class Solution {
	  public int myAtoi(String str) {
		  int max=Integer.MAX_VALUE;
		 
		  int min=-Integer.MIN_VALUE;
		 
		  long result=0;
		  str=str.trim();
		  int len=str.length();
		  int start=0;
		  int sign=0;//1ʱΪ���ţ�2ʱΪ���ţ�0λĬ������
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
			  //����Ӧ������Ƕ����ֱ���˳���˵�����������ֹ淶
			  if(c<'0'||c>'9')
			  {
				 break;  
			  }	 
			  if(c>='0'&&c<='9'){  
				  //���ڼ�������Ľ����û�з��ŵģ�ע����������Сmin�ıȽ�
				  result =result*10+(c-'0');
			  }
			  //��ʱ�б��Ƿ����
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
