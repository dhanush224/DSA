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
    public int maxDepth(TreeNode root) {

        if(root==null) return 0;

        return recursion(root);        
    }

    public int recursion(TreeNode node){

        if(node==null) return 0;

        int left = 1+recursion(node.left);
        int right = 1+recursion(node.right);

        return Math.max(left,right);

    }


}