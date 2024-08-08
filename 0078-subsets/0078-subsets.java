class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls= new ArrayList<>();
        if (nums.length==0) return ls;

        helper(nums,ls,0,new ArrayList<>());
        return ls;
    }

    public void helper(int []nums,List<List<Integer>> ls,int index,List<Integer> cur){
        // if(index==nums.length) {ls.add(cur);
        
        // System.out.println(cur);
        // return ;}
        // ls.add(new ArrayList<>(cur));
        // System.out.println(cur);
        // cur.add(nums[index]);
        // helper(nums,ls,index+1,cur);
        // cur.remove(cur.size()-1);
        // helper(nums,ls,index+1,cur);

        ls.add(new ArrayList<>(cur));
        if (index==nums.length) return ;
        for(int i=index;i<nums.length;i++){
            cur.add(nums[i]);
            helper(nums,ls,i+1,cur);
            cur.remove(cur.size()-1);
        }
    }
}