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
    public boolean isBalanced(TreeNode root) {
        return helper(root)!=-1;
    }
    public int helper(TreeNode node){
        if(node == null) {
            return 0;
        }
        int leftTree=helper(node.left);
        int rightTree=helper(node.right);

        if(leftTree==-1 || rightTree==-1) return -1;
        if(Math.abs(leftTree-rightTree)>1) return -1;
        
        return (1+Math.max(leftTree,rightTree));

    }
}