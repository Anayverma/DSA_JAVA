class Solution {
       List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  // Sort the array to handle duplicates
        helper(candidates, target, new ArrayList<>(), 0);
        return res;
    }
    
    void helper(int[] candidates, int target, List<Integer> tempList, int start) {
        if (target < 0) return;  // Base case: if target becomes negative, no need to proceed
        if (target == 0) {       // Base case: if target is met, add current combination to result
            res.add(new ArrayList<>(tempList));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            
            tempList.add(candidates[i]);
            // Move to the next element in the array
            helper(candidates, target - candidates[i], tempList, i + 1);
            tempList.remove(tempList.size() - 1);  // Backtrack
        }
    }
}