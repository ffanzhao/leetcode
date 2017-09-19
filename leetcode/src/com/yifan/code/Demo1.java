package com.yifan.code;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * @author fan
 *
 *
 *�����ǽ���һ�����Ե��㷨��Ҳ��������Ŀ����ķ���������˼·��ά��һ�����ڣ�
 *ÿ�ι�ע�����е��ַ�������ÿ���ж��У��󴰿ں��Ҵ���ѡ����һ��ǰ�ƶ���
 *ͬ����ά��һ��HashSet, ����������ƶ��Ҵ��ڣ����û�г����ظ�������ƶ��Ҵ��ڣ�
 *��������ظ��ַ�����˵����ǰ�����еĴ��Ѿ�������Ҫ�󣬣���ʱ������������м���Ԫ�أ�Ȼ����max�Ƚϣ�
 *�����ƶ��д��ڲ����ܵõ����õĽ����
 *��ʱ�ƶ��󴰿ڣ�ֱ���������ظ��ַ�Ϊֹ���м���������Щ���в����и��õĽ����
 *��Ϊ���ǲ����ظ����Ǹ��̡���Ϊ�󴰿ں��Ҵ��ڶ�ֻ��ǰ�������������ڶ���ÿ��Ԫ�ط��ʲ�����һ�飬
 *���ʱ�临�Ӷ�ΪO(2*n)=O(n),�������㷨���ռ临�Ӷ�ΪHashSet��size,Ҳ��O(n). 
 */
public class Demo1 {
	public static void main(String[] args) {
		int i=lengthOfLongestSubstring("u");
		System.out.println(i);
	}
    public static int lengthOfLongestSubstring(String s) {
    	
    	if(s==null || s.length()==0)  
            return 0;  
    	
    	ArrayList<Character> set=new ArrayList<Character>();
    	int max=1;
    	int runner=0;
    	int walker=0;
    	while(runner<s.length()){
    		if(set.contains(s.charAt(runner))){//��������а�����Ԫ��
    			if(max<runner-walker){
    				max=runner-walker;
    			}
    			
    			while(s.charAt(walker)!=s.charAt(runner)){
    				set.remove(s.charAt(walker));
    				walker++;
    			}	
    			walker++;//���ϵ�whileѭ�������++�����ƶ���ߵĴ��ڣ�ʹ�ô����ڵ�Ԫ�ز��ظ�
    		}
    		else {//���������
				set.add(s.charAt(runner));
			}
    		runner++;
    	}
    	max=Math.max(max, runner-walker);//����Ҫ
        return max;
    }

}
