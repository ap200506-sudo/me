class Solution {
    int dfs(int [][]grid,int i,int j){
        int p=0;
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return 1;
        }
        if (grid[i][j] == -1){
            return 0;
        }

        grid[i][j]=-1;

        p+=dfs(grid,i+1,j);
        p+=dfs(grid,i,j+1);
        p+=dfs(grid,i-1,j);
        p+=dfs(grid,i,j-1);



        return p;
    }
    public int islandPerimeter(int[][] grid) {

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int c=dfs(grid,i,j);
                    return c;
                }
            }
        }
        return 0;
        
    }
}