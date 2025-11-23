class Solution {
    public int dominantIndex(int[] nums) {
        ArrayList <Integer> h = new ArrayList <>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        
        int ans =h.indexOf(max);
        h.remove(h.indexOf(max));
        for(int val : h){
            if(val > max/2){
                return -1;
            }
        }
        return ans;

        
    }
}