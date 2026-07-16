class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> h = new HashMap<>();
        int res=-1;
        int count=0;
        if(nums.length==1){

            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
                int temp=h.get(nums[i]);
                if(temp>count){
                    count=temp;
                    res=nums[i];
                }
            }
            else{
                h.put(nums[i], 1);
            }
        }
        return res;
        
    }
}