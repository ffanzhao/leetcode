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
 *后，我们介绍一种线性的算法，也是这类题目最常见的方法。基本思路是维护一个窗口，
 *每次关注窗口中的字符串，在每次判断中，左窗口和右窗口选择其一向前移动。
 *同样是维护一个HashSet, 正常情况下移动右窗口，如果没有出现重复则继续移动右窗口，
 *如果发现重复字符，则说明当前窗口中的串已经不满足要求，（此时计算这个窗口有几个元素，然后与max比较）
 *继续移动有窗口不可能得到更好的结果，
 *此时移动左窗口，直到不再有重复字符为止，中间跳过的这些串中不会有更好的结果，
 *因为他们不是重复就是更短。因为左窗口和右窗口都只向前，所以两个窗口都对每个元素访问不超过一遍，
 *因此时间复杂度为O(2*n)=O(n),是线性算法。空间复杂度为HashSet的size,也是O(n). 
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
    		if(set.contains(s.charAt(runner))){//如果集合中包含该元素
    			if(max<runner-walker){
    				max=runner-walker;
    			}
    			
    			while(s.charAt(walker)!=s.charAt(runner)){
    				set.remove(s.charAt(walker));
    				walker++;
    			}	
    			walker++;//以上的while循环和这个++就是移动左边的窗口，使得窗口内的元素不重复
    		}
    		else {//如果不包含
				set.add(s.charAt(runner));
			}
    		runner++;
    	}
    	max=Math.max(max, runner-walker);//很重要
        return max;
    }

}
