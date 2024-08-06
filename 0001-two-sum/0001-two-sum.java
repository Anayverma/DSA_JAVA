class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mMap.put(nums[i],i);
        }
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            if(mMap.containsKey(target - nums[i]) && mMap.get(target - nums[i]) != i){
                res[0] =i;
                res[1] =  mMap.get(target - nums[i]);
            }
        }
        return res;
    }
}