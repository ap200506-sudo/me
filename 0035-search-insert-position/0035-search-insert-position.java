class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;  // avoids overflow
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s = mid + 1; // move right
            } else {
                e = mid - 1; // move left
            }
        }
        return s; // insertion point
    }
}
