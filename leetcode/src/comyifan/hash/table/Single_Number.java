package comyifan.hash.table;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Single_Number {
	
	
    public int singleNumber(int[] nums) {
    	
            int ans=0;
            for(int i=0;i<nums.length;i++){
                ans^=nums[i];
            }
            return ans;
    }

}
