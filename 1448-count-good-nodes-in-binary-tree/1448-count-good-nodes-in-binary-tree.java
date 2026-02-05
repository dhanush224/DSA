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

        if(root.left==null && root.right==null) return 1;
        int total=recursion(root,Integer.MIN_VALUE,0);

        // if(root.left!=null & root.right!=null) total++;
        return total;
        
    }

    public int recursion(TreeNode node, int highestUntilNow, int total){

        if(node==null) return 0;
        total =0;
        if(node.val>=highestUntilNow) {
            highestUntilNow=node.val;
            total=1;
        }    

        total += recursion(node.left,highestUntilNow,total);
        total += recursion(node.right,highestUntilNow,total);


        return total;

    }
}