class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        int j= nums.length-1;
        int mid =(i+j)/2 ;

        while(i<j){
            if(nums[mid]<nums[mid+1]){
                i=mid+1;
            }
            else{
                j=mid;
            }
            mid=(i+j)/2 ;
        }

        return mid;
        
    }
}