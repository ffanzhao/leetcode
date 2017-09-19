package com.yifan.solution;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="s,,,,b";
		String[] split = string.split(",");
		System.out.println(split.length);
		int k;
		if(split.length>=1){
			 k=split.length-1;//for循环，或者if语句中都是判断语句，所以敢于减去一个数，但事
			 //在普通语句中不能用这些语句
		}else {
			 k=split.length;
		}
		for(int i=0;i<=k;i++){
			if(split[i].length()==0) continue;
			System.out.println(split[i]);
		}

	}

}
