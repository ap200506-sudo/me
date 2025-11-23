class Solution {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];
        int left=0;
        int right=n-1;
        int up=0;
        int bottom=n-1;
        int m=1;
        while(left<=right && up<=bottom && m<=n*n){
            for(int i=left;i<=right;i++){
                matrix[up][i]=m;
                m++;
            }
            up++;
            for(int i=up;i<=bottom;i++){
                matrix[i][right]=m;
                m++;
            }
            right--;
            if(left<=right){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=m;
                    m++;
                }
                bottom--;
            }
            if(up<=bottom){
                for(int i=bottom;i>=up;i--){
                    matrix[i][left]=m;
                    m++;
                }
                left++;
            }
        }
        return matrix;
        
    }
}