class Solution {
    
    public int orangesRotting(int[][] grid) {
        
        Queue <int[]> q = new LinkedList <>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int res=0;
        while(!q.isEmpty() && fresh>0){
            int s= q.size();
            for(int y=0;y< s;y++){
                int[] x = q.poll();
                int i= x[0];
                int j=x[1];
                if(i+1<grid.length && grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    q.add(new int[]{i+1,j});
                    fresh--;
                    
                }
                if(j+1<grid[0].length&& grid[i][j+1]==1){
                    grid[i][j+1]=2;
                    q.add(new int[]{i,j+1});
                    fresh--;
                }
                if(i-1>=0&& grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    q.add(new int[]{i-1,j});
                    fresh--;
                }
                if(j-1>=0&& grid[i][j-1]==1){
                    grid[i][j-1]=2;
                    q.add(new int[]{i,j-1});
                    fresh--;
                }
                
            }
            res++;
                
        }
        if(fresh>0){
            return -1;
        }
        return res;
        
    }
}