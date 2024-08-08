class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);  // Optional: Sort the array to make the solution more efficient
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
            tempList.add(candidates[i]);
            // Since we can reuse the same element, we pass 'i' instead of 'i+1'
            helper(candidates, target - candidates[i], tempList, i);
            tempList.remove(tempList.size() - 1);  // Backtrack
        }
    }
}