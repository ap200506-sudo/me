class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<Integer>();
        ArrayList <Integer> al = new ArrayList <>();
        int j=0;
        
        for(int i=0;i<nums2.length;i++){
            h.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(h.contains(nums1[i])){
                if(!al.contains(nums1[i])){
                    al.add(nums1[i]);
                    
                }

            }
        }
        int n=al.size();
        int  arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=al.get(i);
        }
        return arr;
        
    }
}