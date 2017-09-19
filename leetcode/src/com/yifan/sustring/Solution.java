package com.yifan.sustring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
/**
 * 给定一个字符串s和一些长度相同的单词words，找出s的与words中所有单词(words每个单词只出现一次)
 * 串联一起(words中组成串联串的单词的顺序随意)的字符串匹配的所有起始索引，子串要与串联串完全匹配，
 * 中间不能有其他字符。
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
	 * 先把words中每个单词，以words中每个单词为key, 单词出现的次数为value放入map表中
	 * 再在s中每次取三个来去map表找，如果找到则找下三个，如果没找到，则s索引回溯到找到的第一个的索引 + 1。
	 * 
	 * 
	 *  这个题目想想如何提高运算效率
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
    	
    	int k=words[0].length();//记录word中字符串的长度
    	//最外层循环应该每次挪动一个字符的位置
    	Map<String, Integer> map=new HashMap<String, Integer>();
    /*	String s="barfoofoobarthefoobarman";
		String[] words={"bar","foo","the"};*/
    
    	for(int i=0;i<s.length()-k+1;i++) 		
    	{	
    		//将word中的数组存在双列结合中,进行初始化
        	for(int l=0;l<words.length;l++){
        		String key=words[l];
        	
        		map.put(key, map.containsKey(key)?map.get(key)+1:1);	
        		//System.out.println(map);
        	}
    		int cn=0;//出现字符串的个数
    		for(int j=i;j<s.length()-k+1&&(j-i)<=k*words.length;j=j+k){
    			//先取出k个字符
    			String str=s.substring(j, j+k);    		 
    			//核心思想
    			if(map.containsKey(str)&&map.get(str)>0){//如果包含，进行下一步
			    map.put(str,map.get(str)-1);
    				 cn++;
    			}else {	
					break;
				}	  		
    		}	
    		if(cn==words.length){
    			list.add(i);
    		}
    		map.clear();//这个太关键了，要不然每次都会累计到map数据
//    		
    	}
    	
    	return list;
    }

}
