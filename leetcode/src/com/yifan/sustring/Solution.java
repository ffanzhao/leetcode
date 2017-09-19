package com.yifan.sustring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
/**
 * ����һ���ַ���s��һЩ������ͬ�ĵ���words���ҳ�s����words�����е���(wordsÿ������ֻ����һ��)
 * ����һ��(words����ɴ������ĵ��ʵ�˳������)���ַ���ƥ���������ʼ�������Ӵ�Ҫ�봮������ȫƥ�䣬
 * �м䲻���������ַ���
 * 
 * 
 * For example, given:
    s: "barfoothefoobarman"
    words: ["foo", "bar"]

    You should return the indices: [0,9].
    (order does not matter).
 *
 */

public class Solution {
	/**
	 * 
	 * �Ȱ�words��ÿ�����ʣ���words��ÿ������Ϊkey, ���ʳ��ֵĴ���Ϊvalue����map����
	 * ����s��ÿ��ȡ������ȥmap���ң�����ҵ����������������û�ҵ�����s�������ݵ��ҵ��ĵ�һ�������� + 1��
	 * 
	 * 
	 *  �����Ŀ��������������Ч��
	 */
//
	public static void main(String[] args) {
		/*String s="barfoofoobarthefoobarman";
		String[] words={"foo", "bar"};*/
		String s="lingmindraboofooowingdingbarrwingmonkeypoundcake";
		String[] words={"fooo","barr","wing","ding","wing"};
//		"barfoofoobarthefoobarman"
//		["bar","foo","the"]
//		"aaabdbdabbdccadbdcbbacdbddadcaacaadabdacadacaaadcbacdaddda"
//		["cbac","dadd"]
//		"wordgoodgoodgoodbestword"
//		["word","good","best","good"]
//		"lingmindraboofooowingdingbarrwingmonkeypoundcake"
//		["fooo","barr","wing","ding","wing"]
    	
		
		System.out.println(findSubstring(s,words));
	}
    public static List<Integer> findSubstring(String s, String[] words) {
    	
    	List<Integer> list=new ArrayList<Integer>();
    	
    	int k=words[0].length();//��¼word���ַ����ĳ���
    	//�����ѭ��Ӧ��ÿ��Ų��һ���ַ���λ��
    	Map<String, Integer> map=new HashMap<String, Integer>();
    /*	String s="barfoofoobarthefoobarman";
		String[] words={"bar","foo","the"};*/
    
    	for(int i=0;i<s.length()-k+1;i++) 		
    	{	
    		//��word�е��������˫�н����,���г�ʼ��
        	for(int l=0;l<words.length;l++){
        		String key=words[l];
        	
        		map.put(key, map.containsKey(key)?map.get(key)+1:1);	
        		//System.out.println(map);
        	}
    		int cn=0;//�����ַ����ĸ���
    		for(int j=i;j<s.length()-k+1&&(j-i)<=k*words.length;j=j+k){
    			//��ȡ��k���ַ�
    			String str=s.substring(j, j+k);    		 
    			//����˼��
    			if(map.containsKey(str)&&map.get(str)>0){//���������������һ��
			    map.put(str,map.get(str)-1);
    				 cn++;
    			}else {	
					break;
				}	  		
    		}	
    		if(cn==words.length){
    			list.add(i);
    		}
    		map.clear();//���̫�ؼ��ˣ�Ҫ��Ȼÿ�ζ����ۼƵ�map����
//    		
    	}
    	
    	return list;
    }

}
