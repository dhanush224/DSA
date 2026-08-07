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
        if(root==null) return true;

        if(recursion(root,0,0)>=0) return true;
        else return false;

    }

    public int recursion(TreeNode node, int depth, int maxDepth){
        if(node==null) return depth-1;

        int left = recursion(node.left, depth+1, Math.max(depth+1,maxDepth));
        int right = recursion(node.right, depth+1, Math.max(depth+1,maxDepth));
        int diff = 0;
        if(left>right) diff = left-right;
        else diff = right-left;

        if(diff>1 || diff<0) return Integer.MIN_VALUE;
        else return Math.max(left,right);
    }


}