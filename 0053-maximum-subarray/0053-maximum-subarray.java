class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize sum with the first element
        // This will also handle the case when the array has only one element
        int sum = nums[0];
        int maxsum = sum;

        // Start the loop from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current sum is negative, reset it to the current element
            if (sum < 0) {
                sum = nums[i];
            } else {
                // Otherwise, add the current element to the sum
                sum += nums[i];
            }
            
            // Update maxsum if the current sum is greater than maxsum
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }
}
