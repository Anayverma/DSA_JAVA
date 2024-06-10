class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int[] can;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        can = candidates.clone();
        comb(0, target, new ArrayList<>());
        return ans;
    }
    public void comb(int ind, int target, List<Integer> current) {
            if (target == 0) {
                ans.add(new ArrayList<>(current)); 
                return;
            }
            for(int i=ind ;i<can.length;i++){
                if(can[i]>target)
                    break;
            if (i > ind && can[i] == can[i - 1]) 
                    continue;
                current.add(can[i]);
                comb(i+1,target-can[i],current);
                current.remove(current.size() - 1);
            }
     }
}
