class Solution {
    public void dfs(int[][] image , int i , int j, int c, int x ){
        if(i<0||i>=image.length||j<0||j>=image[0].length || image[i][j]!= c){
            return ;
        }
        image[i][j]=x;
        dfs(image, i+1, j , c,x);
        dfs(image, i, j+1 , c,x);
        dfs(image, i-1, j , c,x);
        dfs(image, i, j-1 , c,x);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int c=image[sr][sc];
        if (c == color)
            return image;
        
        dfs(image, sr,sc, c, color);

        return image;
        
    }
}