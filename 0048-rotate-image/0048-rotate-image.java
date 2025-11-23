class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=x;
            }
        }
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<high){
                int x=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=x;
                low++;
                high--;
            }
        }
        
    }
}