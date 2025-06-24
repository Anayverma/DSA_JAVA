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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return root;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode e=queue.poll();
                TreeNode s=e.left;
                e.left=e.right;
                e.right=s;
            if(e.left!=null){
                queue.add(e.left);
            }
            if(e.right!=null){
                queue.add(e.right);
            }
        }
        return root;
    }
}