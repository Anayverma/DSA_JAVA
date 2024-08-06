class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi = 0, ni = 1;
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                result[pi] = nums[i];
                pi += 2;
            } else {
                result[ni] = nums[i];
                ni += 2;
            }
        }
        
        return result;
    }
}
