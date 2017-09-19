package comyifan.hash.table;

public class Island_Perimeter {
	
	
    public int islandPerimeter(int[][] grid) {
    	int row=grid.length;
    	int column=grid[0].length;
    	int count=0;
        int islands = 0, neighbours = 0;

    	for(int i=0;i<row;i++){
    		for(int j=0;j<column;j++){
    			
    			if(grid[i][j]==1){
    				count ++;
    				  if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; // count down neighbours
                      if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; // count right neighbours
    			}
    			
    		}
    	}
		return count*4-neighbours*2;
        
    }

}
