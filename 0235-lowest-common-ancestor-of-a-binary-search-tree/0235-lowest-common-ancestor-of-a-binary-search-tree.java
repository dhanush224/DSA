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
        int one = p.val;
        int two = q.val;

        while((node.val>one && node.val>two) || (node.val<one && node.val<two)){
            if(node.val>one && node.val>two) node=node.left;
            else node = node.right;

            if((one<node.val && node.val<two)) break;
        }

        return node;               
        
    }
}