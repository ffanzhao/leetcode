package com.yifan.solution;

public class ReverWord {

	public static void main(String[] args) {
		String s="the sky is blue hahha  ";
//		String s="   a   b ";

		
		
		System.out.print(reverseWords(s));

	}
     public static String reverseWords(String s) {
    	 //建立一个字符串缓冲池
    	 StringBuffer sb=new StringBuffer();
    	 //首先去掉字符串首位的空格
    	 s=s.trim();
    	 //用空格作为关键字，分割字符串，但是这里要特别注意，如果不是在末尾处，之前连住的关键字，会分割出空
    	 String[] split = s.split(" ");
    	 
    	 for(int i=split.length-1;i>=0;i--){
    		 //如
    		 if(split[i].length()==0)continue;
    		
    		 sb.append(split[i]);
    		 sb.append(" ");
    	 }
    	if(sb.length()>=1){
    		sb=sb.deleteCharAt(sb.length()-1);//这种减一的动作，最好做出判断以后再减去，要不然容易出现字符串越界
    	}
         return new String(sb);
    	 
    }

}
