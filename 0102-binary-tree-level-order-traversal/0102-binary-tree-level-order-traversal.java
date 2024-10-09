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
        Queue<TreeNode> tree=new LinkedList<>();
        tree.add(root);
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        while(!tree.isEmpty()){
            int len=tree.size();
            int i=0;
            List<Integer> list=new ArrayList<>();
            while(i<len){
                TreeNode node= tree.remove();
                System.out.println(node.val);
                list.add(node.val);
               if (node.left != null) tree.add(node.left);   // Add left child if not null
                if (node.right != null) tree.add(node.right);
                i++;
            }
            result.add(list);
        }
        return result;
    }
}