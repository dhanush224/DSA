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
        if(recursion(root,0,0)<0) return false;
        else return true;         
    }

    public int recursion(TreeNode node, int depth, int maxDepth){
        if(node==null) return depth;

        int x=recursion(node.left,depth+1,maxDepth);
        int y=recursion(node.right,depth+1,maxDepth);

        int diff= Math.max(x-y,y-x);

        if(x>y) maxDepth=x;
        else maxDepth=y;

        if(diff>1) {
            return -1;
        }

        return maxDepth;
    }
}