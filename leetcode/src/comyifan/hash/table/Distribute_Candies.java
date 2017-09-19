package comyifan.hash.table;

import java.util.HashSet;
import java.util.Set;

public class Distribute_Candies {
    public int distributeCandies(int[] candies) {
    	
    	Set<Integer>set=new HashSet<>();

    	for (int k : candies) {
			set.add(k);
			
		}
    	
		return set.size()>(candies.length/2) ? (candies.length/2):set.size();
        
    }

}
