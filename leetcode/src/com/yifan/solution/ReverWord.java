package com.yifan.solution;

public class ReverWord {

	public static void main(String[] args) {
		String s="the sky is blue hahha  ";
//		String s="   a   b ";

		
		
		System.out.print(reverseWords(s));

	}
     public static String reverseWords(String s) {
    	 //����һ���ַ��������
    	 StringBuffer sb=new StringBuffer();
    	 //����ȥ���ַ�����λ�Ŀո�
    	 s=s.trim();
    	 //�ÿո���Ϊ�ؼ��֣��ָ��ַ�������������Ҫ�ر�ע�⣬���������ĩβ����֮ǰ��ס�Ĺؼ��֣���ָ����
    	 String[] split = s.split(" ");
    	 
    	 for(int i=split.length-1;i>=0;i--){
    		 //��
    		 if(split[i].length()==0)continue;
    		
    		 sb.append(split[i]);
    		 sb.append(" ");
    	 }
    	if(sb.length()>=1){
    		sb=sb.deleteCharAt(sb.length()-1);//���ּ�һ�Ķ�������������ж��Ժ��ټ�ȥ��Ҫ��Ȼ���׳����ַ���Խ��
    	}
         return new String(sb);
    	 
    }

}
