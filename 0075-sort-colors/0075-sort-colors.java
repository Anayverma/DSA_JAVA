class Solution {
    public void sortColors(int[] nums) {
    //    int i=0,l=nums.length-1;
    //    while(i<l){
    //     System.out.println(i+"  "+l);
    //     if(nums[i]==2 && nums[l]==0) 
    //     {
    //         int t=nums[i];
    //         nums[i]=nums[l];
    //         nums[l]=t;
    //         i++;
    //         l--;
    //         continue;
    //     }
    //     if(nums[i]==0) i++;
    //     if(nums[l]==2||nums[l]==1) l--;
    //    } 
    Arrays.sort(nums);
    }
}