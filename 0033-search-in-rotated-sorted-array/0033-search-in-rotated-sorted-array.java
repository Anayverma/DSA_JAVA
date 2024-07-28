class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
      while(left<right){
        int mid=(left+right)/2;
        System.out.println(mid+"  l"+left+"  R"+right);
        if(target == nums[mid]) return mid;
        else if(target>=nums[left] && target<nums[mid]) right=mid-1;
        else if(target <=nums[right] && target>nums[mid]) left= mid+1;
        else if( target > nums[right] ) right= mid-1;
        else left= mid+1;
      }  if(left>=0&& left<nums.length&&nums[left]==target)return left;
      if(right >=0&&right <nums.length&&nums[right]== target) return right;
      return -1;
    }
}