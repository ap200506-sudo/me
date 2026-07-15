class Solution {
    void merge(int[] nums, int s, int e, int m){
        int [] left = new int[m-s+1];
        int [] right = new int[e-m];

        for(int i=0;i<m-s+1;i++){
            left[i]=nums[s+i];

        }
        for(int i=0;i<e-m;i++){
            right[i]=nums[m+i+1];
            
        }
        int n=s;
        int x=0;
        int y=0;
        while(x<m-s+1 & y<e-m){
            if(left[x]<right[y]){
                nums[n++]=left[x++];
            }
            else{
                nums[n++]=right[y++];
            }
        }
        for(int i=x;i<m-s+1;i++){
            nums[n++]=left[i];
        }
        for(int i=y;i<e-m;i++){
            nums[n++]=right[i];
        }
    }

    void mergesort(int[] nums, int s, int e){
        if(s<e){
            int m=(s+e)/2;
            mergesort(nums, s, m);
            mergesort(nums, m+1, e);
            merge(nums,s,e,m);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        mergesort(nums,0,nums.length-1);

        return nums[nums.length-k];
        
    }
}