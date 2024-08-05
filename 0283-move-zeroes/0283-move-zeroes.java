class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,last=nums.length-1,index=0;
        for( i=0;i<nums.length;i++) if(nums[i]!=0)  nums[index++]=nums[i];
        for( i=index;i<nums.length;i++) nums[i]=0;
        
    }
}