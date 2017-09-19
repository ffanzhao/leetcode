package com.yifan.code;
//Longest Palindromic Substring

 /*��һ�ַ����Ƚ�ֱ�ӣ�ʵ�������Ƚ�������⡣����˼·�Ƕ���ÿ���Ӵ�������
��������һ���ַ��������������ַ��ļ�϶�����紮abc,���Ŀ�����a,b,c,������ab�ļ�϶��bc�ļ�϶��
������ͬʱ����ɨ�裬ֱ�����ǻ��Ĵ�Ϊֹ�������ַ����ĳ���Ϊn,��ô���ĵĸ���Ϊ2*n-1
(�ַ���Ϊ������n������϶��n-1����������ÿ������������ɨ��ĸ��Ӷ�ΪO(n),
		����ʱ�临�Ӷ�ΪO((2*n-1)*n)=O(n^2),�ռ临�Ӷ�ΪO(1)���������£�*/
public class Demo3 {
	public static void main(String[] args) {
		String str="cabad";
		System.out.println(longestPalindrome(str));
	}
    public static String longestPalindrome(String s) {
    	
    	if(s.length()==0||s==null){
    		return "";
    	}
    	String res="";
    	int max=0;
        for(int i=0;i<2*s.length()-1;i++){
        	int left=i/2;
        	int right=i/2;
        	if(i%2==1){
        		right++;
        	}
        	String str=legthOfPalindromic(s,left,right);
        	
        	if(str.length()>max){
        		
        		max=str.length();
        		res=str;
        	}
        }
        return res;
    }
	private static String legthOfPalindromic(String s, int left, int right) {
		
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		return s.substring(left+1, right);
	}
}
