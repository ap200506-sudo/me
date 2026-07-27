class Solution {
    public int lengthOfLIS(int[] nums) {

        int memo []= new int [nums.length];

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(memo[j]+1 >memo[i]){
                        memo[i]=memo[j]+1;
                    }
                }
            }
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(memo[i]>max){
                max=memo[i];
            }
        }
        return max+1;
        
    }
}