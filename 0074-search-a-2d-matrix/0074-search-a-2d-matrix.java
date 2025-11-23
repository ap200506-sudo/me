class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;
        int low=0;
        int high =n-1;
        int i=0;
        while(i<matrix.length){
            if(matrix[i][low]==target){
                return true;
            }
            if(target>=matrix[i][low] && target<=matrix[i][high]){
                
                while(low<=high){
                    int mid=(low+high)/2;
                    if(target==matrix[i][mid]){
                        return true;
                    }
                    else if(target<matrix[i][mid]){
                        
                        high=mid-1;
                        
                    }
                    else{
                        low=mid+1;
                    }
                }

            }
            i++;
        }
        return false;


    }
}