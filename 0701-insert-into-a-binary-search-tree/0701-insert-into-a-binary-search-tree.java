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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode node = root;
        TreeNode n = new TreeNode(val);

        while(true){
            if(node.val>val){
                if(node.left!=null) node=node.left;
                else{
                    node.left=n;
                    break;
                }
            }else{
                if(node.right!=null) node=node.right;
                else{
                    node.right=n;
                    break;
                }
            }
        }   

        return root;
    }
}