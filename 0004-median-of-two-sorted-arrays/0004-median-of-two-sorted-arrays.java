class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int  [] arr = new int[nums1.length+ nums2.length];
        double finalans=0;
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int j=0;
        for(int i=nums1.length;i<nums1.length+ nums2.length;i++){
            
            arr[i]=nums2[j];
            j++;
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            int ans=arr.length/2;
            finalans= arr[ans];
        }
        else if(arr.length%2==0){
            int ans=arr.length/2;
            finalans= ((arr[ans]+ arr[ans-1])/2.0);
        }
        return finalans;  
    }
}