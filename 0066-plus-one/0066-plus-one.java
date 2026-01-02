class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // simple increment
                return digits;
            }
            digits[i] = 0;  // set to 0 and carry to next digit
        }

        // If all digits were 9, you need a new array like [1, 0, 0, 0...]
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
