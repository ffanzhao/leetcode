package com.yifan.solution;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="s,,,,b";
		String[] split = string.split(",");
		System.out.println(split.length);
		int k;
		if(split.length>=1){
			 k=split.length-1;//forѭ��������if����ж����ж���䣬���Ը��ڼ�ȥһ����������
			 //����ͨ����в�������Щ���
		}else {
			 k=split.length;
		}
		for(int i=0;i<=k;i++){
			if(split[i].length()==0) continue;
			System.out.println(split[i]);
		}

	}

}
