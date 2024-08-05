class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,one=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==1)  max++;
            else {
                one=Math.max(one,max);
                max=0;
            }
        return Math.max(one,max);
    }
}