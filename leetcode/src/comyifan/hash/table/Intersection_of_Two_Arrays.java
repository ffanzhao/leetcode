package comyifan.hash.table;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
	public static void main(String[] args) {
		int []num1={1, 2, 2, 1};
		int []num2={ 2, 2,};
		int[]arr=intersection(num1, num2);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
    public static int[] intersection(int[] nums1, int[] nums2) {
    	
    	Set<Integer> set1=new HashSet<>();
    	Set<Integer> set2=new HashSet<>();
    	for(int i=0;i<nums1.length;i++){
    		set1.add(nums1[i]);
    	}
    	
    	
    	for(int i=0;i<nums2.length;i++){
    		if(set1.contains(nums2[i])){
    			set2.add(nums2[i]);
    		}
    	}
    	int []result=new int[set2.size()];
    	int i=0;
    	for(Integer res:set2){
    		result[i++]=res;
    	}
		return result;
        
    }

}
