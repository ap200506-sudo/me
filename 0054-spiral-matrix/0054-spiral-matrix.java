class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> ans = new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int up=0;
        int bottom=matrix.length-1;

        while(left<=right && up<=bottom){
            for(int i=left;i<=right;i++){
                ans.add(matrix[up][i]);
                
            }
            up++;
            for(int i=up;i<=bottom;i++){
                ans.add(matrix[i][right]);
                
            }
            
            right--;
            if(up<=bottom){
                for(int i = right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=up;i--){
                    ans.add(matrix[i][left]);
                }
                
            }
            
            left++;

        }
        return ans;
        
    }
}