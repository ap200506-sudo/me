class Solution {
    public int findMin(int[] nums) {
        int low=nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]<low){
                low=nums[i];
            }
        }
        return low;
        
    }
}