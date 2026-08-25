class Solution {
    public int missingMultiple(int[] nums, int k) {
         boolean[] isPresent = new boolean[101];
        for (int num : nums) {
            isPresent[num] = true;
        }

        // Step 2: Check multiples of k starting from k (k, 2k, 3k...)
        for (int m = k; ; m += k) {
            // If the multiple exceeds 100, it cannot be in the array, so it is missing
            if (m > 100 || !isPresent[m]) {
                return m;
            }
        }
}
}