class Solution {
    public int numberOfMatches(int n) {
        int ans=n;
        int matches=0;
        while(ans!=1){
            if(ans%2==0){
                
                ans=ans/2;
                matches+=ans;
                
            }
            else{
                
                ans=1+((ans-1)/2);
                matches+=ans-1;
                
            }
        }
        return matches;
        
    }
}