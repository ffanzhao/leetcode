package com.yifan.code;
//Longest Palindromic Substring

 /*第一种方法比较直接，实现起来比较容易理解。基本思路是对于每个子串的中心
（可以是一个字符，或者是两个字符的间隙，比如串abc,中心可以是a,b,c,或者是ab的间隙，bc的间隙）
往两边同时进行扫描，直到不是回文串为止。假设字符串的长度为n,那么中心的个数为2*n-1
(字符作为中心有n个，间隙有n-1个）。对于每个中心往两边扫描的复杂度为O(n),
		所以时间复杂度为O((2*n-1)*n)=O(n^2),空间复杂度为O(1)，代码如下：*/
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
