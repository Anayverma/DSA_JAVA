/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TreeNode lca= 
        return getLCA(root,p,q);
    }
    public TreeNode getLCA(TreeNode node, TreeNode p,TreeNode q){
        if( node == null ) return null;
        if(node.val==p.val) return p;
        if(node.val==q.val) return q;
        TreeNode factl=null,factr=null;
        if(node.left!=null) factl=getLCA(node.left,p,q);
        if(node.right!=null) factr=getLCA(node.right,p,q);
        if(factl!=null && factr!=null)
        if((factl.val==p.val&&factr.val==q.val)||(factl.val==q.val&&factr.val==p.val)) return  node;
        if(factl!=null) return factl;
        if(factr!=null) return factr;
        else return null;
    }
}