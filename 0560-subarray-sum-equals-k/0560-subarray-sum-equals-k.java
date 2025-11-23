class Solution {
    public int subarraySum(int[] nums, int k) {
        int counter=0;
        HashMap <Integer, Integer> m= new HashMap<Integer, Integer>();
        int sum=0;
        m.put(0,1);
        for(int x: nums){
            
            sum+=x;
            
            if(m.containsKey(sum-k)){
                counter +=m.get(sum-k);
               
            }
            m.put(sum, m.getOrDefault(sum,0)+1);
            
        }
        return counter;
        
        
    }
}