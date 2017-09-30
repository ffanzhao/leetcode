package com.yifan.two.pointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Longest_Word_in_Dictionary_through_Deleting {
	
	 public static void main(String[] args) {
		String s = "abpcplea";
		List<String> d=new ArrayList<>();
		d.add("monkey");
		d.add("ale");
		d.add("apple");
		d.add("plea");
		String word = findLongestWord(s, d);
		System.out.println(word);;
	}
	
	 public static String findLongestWord(String s, List<String> d) {
		 
			int max=0;
		    int pos=0;
		    Collections.sort(d);
		    for (String string : d) {
				System.out.println(string);
			}
	        for(int i=0;i<d.size();i++){
	        	String string=d.get(i);
	        	int j=0;
	        	int k=0;
	        	while(j<string.length()&&k<s.length()){
	        		if(string.charAt(j)!=s.charAt(k)){
		        		k++;
		        	}else {
						j++;
						k++;
					}
	        	}
	        	if(j==string.length()){
	        		if(string.length()>max){
	        			max=string.length();
	        			pos=i;
	        		}
	        	}
	        	
	        }
	        if(max>0){return d.get(pos);}
	        
	        return "";
	 }

	
}
