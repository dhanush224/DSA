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
        if(recursion(root,root,0,0)<0) return false;
        else return true;         
    }

    public int recursion(TreeNode root, TreeNode node, int depth, int maxDepth){
        if(node==null) return depth;
        int x=0;
        int y=0;

        x = recursion(root,node.left,depth+1,maxDepth);
        y = recursion(root,node.right,depth+1,maxDepth);

        int diff= Math.max(x-y,y-x);

        if(x>y) maxDepth=x;
        else maxDepth=y;

        if(diff>1) {
            return Integer.MIN_VALUE;
        }

        return maxDepth;
    }
}