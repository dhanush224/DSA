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
    int maxSum = -1001;
    public int maxPathSum(TreeNode root) {

        recursion(root);
        return maxSum;
        
    }

    public int recursion(TreeNode node){
        if(node==null) return 0;

        int x = recursion(node.left);
        int y = recursion(node.right);

        int res = node.val+x+y;
        int left = node.val+x;
        int right = node.val+y;
        if(left>res) res = left;
        if(right>res) res = right;
        if(node.val>res) res = node.val;

        maxSum = Math.max(res,maxSum);

        if(left>right) res=left;
        else res=right;

        if(node.val>res) res=node.val;
        
        return res;
    }
}