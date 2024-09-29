class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, dp, nums.length - 1);
        // System.rc();
    }

    public int helper(int[] nums, int[] dp, int n) {
        if (n < 0) return 0; 
        if (dp[n] != -1) return dp[n]; 
        int robCurrent = nums[n] + helper(nums, dp, n - 2); 
        int skipCurrent = helper(nums, dp, n - 1);          
        
        dp[n] = Math.max(robCurrent, skipCurrent);
        return dp[n];  
    }
}
