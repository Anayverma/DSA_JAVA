class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 0, len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[prev] != nums[i]) {
                nums[len] = nums[i];
                len++;
                prev = len - 1; // Corrected this line
            }
        }
        return len;
    }
}
