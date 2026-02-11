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

    public int recursion(TreeNode node, int length, int finalLength){
        if(node.left==null && node.right==null){
            return length;
        }

        int x=0;
        int y = 0;

        if(node.left!=null) x = recursion(node.left,length+1,finalLength);
        if(node.right!=null) y = recursion(node.right,length+1,finalLength);

        if(x>y)finalLength = x;
        else finalLength = y;

        return finalLength;
    }
}