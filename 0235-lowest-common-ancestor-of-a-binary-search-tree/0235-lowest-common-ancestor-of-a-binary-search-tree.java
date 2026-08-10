/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode node = root;

        while((node.val>p.val && node.val>q.val) || (node.val<p.val && node.val<q.val)){
            if(node.val>p.val && node.val>q.val) node=node.left;
            else node = node.right;

            if((p.val<node.val && node.val<q.val) || (q.val<node.val && node.val<p.val)) break;
        }

        return node;               
        
    }
}