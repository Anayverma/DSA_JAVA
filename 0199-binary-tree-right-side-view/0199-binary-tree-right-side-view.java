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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightWala(root, res, 0);
        return res;
    }
    
    public void rightWala(TreeNode node, List<Integer> res, int level) {
        if (node == null) return;

        if (level == res.size()) {
            res.add(node.val);
        }
        
        rightWala(node.right, res, level + 1);
        rightWala(node.left, res, level + 1);
    }
}
