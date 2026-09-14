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
    public int goodNodes(TreeNode root) {

        return recursion(root,root.val,0);

    }

    public int recursion(TreeNode node, int max, int count){
        if(node==null) return count;

        if(node.val>=max) {
            count++;
            max=node.val;
        }
        if(node.left!=null)count=recursion(node.left,max,count);
        if(node.right!=null)count=recursion(node.right,max,count);

        return count;

    }
}