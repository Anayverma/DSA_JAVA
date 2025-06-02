class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int d=Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                int sum=nums[i]+nums[j]+nums[k];
                // System.out.println(sum);
                if(Math.abs(target-sum)<Math.abs(target-d)){
                    d=sum;
                }
                if( k+1<nums.length && (Math.abs(target-sum) < Math.abs(target-(nums[i]+nums[j]+nums[k+1])))){
                    break;
                }
            }
        }
    }
    return d;   
    }
}