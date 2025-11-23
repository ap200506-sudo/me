class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashSet <Integer> h= new HashSet <Integer>();
        int sum=0;
        int prev=0;
        for(int x: nums){
            sum+=x;
            if(k!=0){
                sum=sum%k;
            }
            if(h.contains(sum) ){
                return true;
            }
            h.add(prev);
            prev=sum;
        }
        return false;
        
    }
}