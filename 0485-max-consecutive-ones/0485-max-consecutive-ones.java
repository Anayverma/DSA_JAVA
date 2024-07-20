class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone=0,count=0;
        for(int i:nums){
            count=i==1?count+1:0;
            maxone=Math.max(count,maxone);
        }
        return maxone;
    }
}