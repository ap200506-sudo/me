class Solution {
    public void rotate(int[] nums, int k) {
        int temp[]=new int[k];
        int j=0;
        if(k>nums.length){
            k=k%nums.length;
        }else{
            k=k;
        }
        

        for(int i=nums.length-k;i<nums.length;i++){
            
            temp[j]=nums[i];
            j++;
        }
        j=0;
        for(int i=nums.length-1;i>=k;i--){
            
            nums[i]=nums[i-k];
            
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
        
       
        
        
    }
}