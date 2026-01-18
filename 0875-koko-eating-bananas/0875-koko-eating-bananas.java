class Solution {
    public double hours(int[]arr, int x){
        double time=0;
        for(int i=0;i<arr.length;i++){
            double t = Math.ceil((double) arr[i] / x);

            time+=t;
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int fans=0;
        
        for(int i =0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int s=1;
        int e=max;
        while(s<=e){
            int mid=(s+e)/2;
            double ans=hours(piles,mid);
            if(ans>h){
                s=mid+1;
            }
            else if(ans<=h){
                fans=mid;
                e=mid-1;
            }
            

        }
        return fans;
        
    }
}