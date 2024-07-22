class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // Sort the array to handle duplicates
        helper(nums, new ArrayList<>(), 0);
        return res;
    }
    
    void helper(int[] nums, List<Integer> tempList, int index) {
        res.add(new ArrayList<>(tempList));  // Add the current subset to the result list
        
        for (int i = index; i < nums.length; i++) {
            // Skip duplicates
            if (i > index && nums[i] == nums[i - 1]) continue;
            
            tempList.add(nums[i]);
            helper(nums, tempList, i + 1);
            tempList.remove(tempList.size() - 1);  
        }
    }
}