class Solution {
    public int pivotpoint(int[] nums) {
        int s=0;
        int e= nums.length-1;
        int mid=(s+e)/2;
        while(s<e){
            if(nums[mid]>=nums[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=(s+e)/2;
        }
        return e;
        
    }


    public int binarySearch(int[] nums, int target,int start, int end) {
        int s=start;
        int e=end;
        
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            

        }
        return -1;
        
    }



    public int search(int[] nums, int target) {
        int pivot=pivotpoint(nums);
        int ans=-1;
        if(nums.length==1){
            if(nums[0]==target){
                ans=0;
            }
            else{
                ans=-1;
            }
        }
        else if(target>=nums[0] && target<=nums[pivot-1] ){
            ans=binarySearch(nums,target ,0,pivot-1);
        }
        else{
            ans=binarySearch(nums,target, pivot, nums.length-1);
        }
        return ans;
        
    }
}