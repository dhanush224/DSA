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

        return recursion(root,1,1);        
    }

    public int recursion(TreeNode node, int depth, int maxDepth){

        if(node==null) return maxDepth-1;

        int left = recursion(node.left,depth+1,Math.max(maxDepth,depth+1));
        int right = recursion(node.right,depth+1,Math.max(maxDepth,depth+1));
        maxDepth= Math.max(left,right);

        return maxDepth;

    }


}