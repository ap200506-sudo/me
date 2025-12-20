class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n =nums.length;
        ArrayList <Integer> al= new ArrayList <>();

        HashSet<Integer> h= new HashSet <>();
        
        for(int i=0;i<n;i++){
            h.add(nums[i]);
        }


        for(int i=1;i<=n;i++){

            if(!h.contains(i)){
                al.add(i);
            }
        }
        return al;
        
        
    }
}