class Solution {
    public int findMiddleIndex(int[] nums) {

        int total = 0;

        // Total sum
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna