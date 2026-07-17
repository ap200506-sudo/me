class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            h.put(nums2[i],i);
        }
        int [] arr = new int[nums1.length];
        int j=0;
        for(int i=0;i<nums1.length;i++){
            int x=nums1[i];
            int idx= h.get(x);
            if(idx==nums2.length-1){
                arr[j++]=-1;
            }
            else {
                int k=idx;
                for(k=idx;k<nums2.length;k++){
                    if(nums2[k]>x){
                        arr[j++]=nums2[k];
                        break;
                    }
                }
                if(k==nums2.length){
                    arr[j++]=-1;
                }
                
                
            }
        }
        return arr;
        
    }
}