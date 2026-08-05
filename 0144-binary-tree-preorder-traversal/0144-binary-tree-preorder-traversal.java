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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if(root==null) return list;

        recursion(root,list);
        return list;

    }

    public void recursion(TreeNode node, List<Integer> list){

        list.add(node.val);
        if(node.left!=null)recursion(node.left,list);
        if(node.right!=null)recursion(node.right,list);

        return;
    }
}