class Solution {
    public void sortColors(int[] nums) {

        for(int i=0;i<nums.length-1;i++){
            int minidx=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minidx]){
                    minidx=j;
                }
            }
            int x=nums[i];
            nums[i]=nums[minidx];
            nums[minidx]=x;
        }
        
    }
}