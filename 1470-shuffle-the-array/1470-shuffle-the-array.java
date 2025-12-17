class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m =nums.length;
        int arr1[]= new int[m/2];
        int arr2[]=new int[m/2];
        int res [] = new int[m];
        for(int i=0;i<m/2;i++){
            arr1[i]=nums[i];
        }
        for(int i=0;i<m/2;i++){
            arr2[i]=nums[i+n];
        }
        int j=0;
        int k=0;
        for(int i=0;i<m;i++){
            if(i%2==0){
                res[i]=arr1[j];
                j++;
            }
            else{
                res[i]=arr2[k];
                k++;
            }
        }
        return res;
        
    }
}