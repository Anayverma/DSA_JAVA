import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int[] can;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        can = candidates.clone();
        comb(0, target, new ArrayList<>());
        return ans;
    }

    public void comb(int ind, int target, List<Integer> current) {
        if (target == 0) {
            ans.add(new ArrayList<>(current)); // Create a new ArrayList when adding to ans
            return;
        }

        for (int i = ind; i < can.length; i++) {
            if (can[i] <= target) {
                current.add(can[i]);
                comb(i, target - can[i], current); // Update the target and continue exploring
                current.remove(current.size() - 1); // Revert the list back to its original state
            }
        }
    }
}
