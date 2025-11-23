class Solution {
    public int mySqrt(int x) {
        
        if(x<2){
            return x;
        }
        int s=0;
        int e=x/2;
        int mid=(s+e)/2;
        int ans=0;
        while(s<=e){
            mid=(s+e)/2;
            long sqrt=(long)mid*mid;

            if(sqrt==x){
                return mid;
            }
            else if(sqrt>x){
                
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;
            }
            
        }
        
        return ans;   
    }
}