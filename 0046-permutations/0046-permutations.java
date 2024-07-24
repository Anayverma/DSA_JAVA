class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ele=new ArrayList<>();
        boolean [] used=new boolean[nums.length];
        helper(0,nums,ele,used);
        return res;
    }
    public void helper(int index,int [] nums,List<Integer> ele,boolean[] used){
        if(ele.size()==nums.length) res.add(new ArrayList<>(ele));
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i]=true;
            ele.add(nums[i]);
            helper(i+1,nums,ele,used);
            ele.remove(ele.size()-1);
            used[i]=false;
        }
    }
}