class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet <Integer> h = new HashSet <Integer>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        while(h.contains(original)){
            original=original*2;
        }
        return original;
    }
}