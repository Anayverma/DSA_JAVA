class Solution {
    public int maxProduct(int[] nums) {
        double p=1,s=1,res=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            p=(p==0)?1:p;
            s=(s==0)?1:s;
            p*=nums[i];
            s*=nums[nums.length-i-1];
            res=Math.max(res,Math.max(p,s));
        }
        return (int) res;

    }
}