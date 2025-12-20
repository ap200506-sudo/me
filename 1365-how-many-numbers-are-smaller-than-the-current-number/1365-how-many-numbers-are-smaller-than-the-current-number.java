class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> h = new ArrayList <>();

        for(int i =0 ;i<nums.length;i++){
            h.add(nums[i]);
        }
        int arr[] = new int [nums.length];
        for(int i =0;i<nums.length;i++){
            int counter =0;
            for(int n : h){
                if(nums[i]>n){
                    counter ++;
                }
            }
            arr[i]=counter;
        }
        return arr;
        
    }
}