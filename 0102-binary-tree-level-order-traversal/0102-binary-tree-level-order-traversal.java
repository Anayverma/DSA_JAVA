/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> tree= new LinkedList<>();
        

        tree.add(root);
        List<List<Integer>> res= new ArrayList<>();
        if (root == null) {
            return res;  // Return an empty result
        }
        while(tree.size()!=0){
            int l=tree.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<l;i++){
            TreeNode test=tree.poll();
                arr.add(test.val);
                if(test.left!=null) tree.add(test.left);
                if(test.right!=null) tree.add(test.right);
            }
            res.add(arr);
        }
        


    return res;
        // Queue<TreeNode> tree=new Queue<>();
        // tree.add(root);
        // ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        // while(!tree.isEmpty())
        // {
        //     TreeNode node = tree.poll();
        //     res.add(new ArrayList<>(node.val));
        //     if(node.left!=null)ree.add(node.left);
        //     if(node.right!=null)tree.add(node.right);
        // }
    }
}