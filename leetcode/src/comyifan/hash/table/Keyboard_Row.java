package comyifan.hash.table;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Keyboard_Row {
	public static void main(String[] args) {
		String[]arr ={"Hello", "Alaska", "Dad", "Peace"};
		String[] str=findWords(arr);
		for (String w : str) {
			System.out.println(w);
		}
	}
	 public static String[] findWords(String[] words) {
	        String [] strs={"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
	        Map<Character,Integer> map=new HashMap<>();
	        for(int i=0;i<strs.length;i++){
	            for(char c:strs[i].toCharArray()){
	                map.put(c,i);//将字母作为键，哪一样作为值
	            }
	        }
	        List<String> res=new LinkedList<>();//选取LinkedList是为了方便插入
	        for(String w: words){
	            if(w.equals("")) continue;
	            int index= map.get(w.toUpperCase().charAt(0));
	            for(char c:w.toUpperCase().toCharArray()){
	                if(map.get(c)!=index){
	                    index=-1;
	                    break;
	                }
	            }
	            if(index!=-1) res.add(w);
	        }
	        return res.toArray(new String[0]);
	    }

}
