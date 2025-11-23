class Solution {
    public int maximumCandies(int[] candies, long k) {
        int sum=0;
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>=max){
                max=candies[i];
            }
        }
        int ans=0;
        int s=1;
        int e=max;
        int mid=(s+e)/2;
        while(s<=e){
            mid=(s+e)/2;
            long stdcount=0;
            for(int i=0;i<candies.length;i++){
                int child=(candies[i])/mid;
                stdcount+=child;
            }
            
            if(stdcount>=k){
                ans=mid;
                s=mid+1;
                
            }
            else{
                e=mid-1;
            }
        }
        return ans;
        
    }
}