class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap <Integer, Integer> m= new HashMap <Integer, Integer> ();
        int sum=0;
        int counter =0;
        m.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            
            if(m.containsKey(rem)){
               
                
                
                counter+=m.get(rem);
                
            }

            m.put(rem, m.getOrDefault(rem,0)+1);
        }
        return counter;
        
    }
}