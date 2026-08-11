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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        recursion(root,list);
        return list.get(k-1);        
    }

    public void recursion(TreeNode node, List<Integer> list){
        if(node==null) return;

        recursion(node.left,list);
        list.add(node.val);
        recursion(node.right,list);
    }
}