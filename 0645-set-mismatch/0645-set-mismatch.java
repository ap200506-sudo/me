class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int[] ans = new int[2];

        // count frequency
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        // find duplicate and missing
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                ans[0] = i; // duplicate
            }
            if (freq[i] == 0) {
                ans[1] = i; // missing
            }
        }

        return ans;
        
    }
}