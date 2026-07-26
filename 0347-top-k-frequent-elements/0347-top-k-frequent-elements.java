class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
        for(int i=0;i<nums.length;i++){
            int x=0;
            if(h.containsKey(nums[i])){
                x= h.get(nums[i]);
                
            }
            h.put(nums[i],x+1);
        }
        for(Map.Entry<Integer, Integer> entry : h.entrySet()){
            pq.add(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int [] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=(pq.poll()).getKey();
        }
        return arr;

        
    }
}