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
        recursion(root,list,k);
        return list.get(list.size()-1);        
    }

    public void recursion(TreeNode node, List<Integer> list, int k){
        if(node==null) return;

        if(list.size()==k) return;
        recursion(node.left,list,k);
        if(list.size()==k) return;
        list.add(node.val);
        if(list.size()==k) return;
        recursion(node.right,list,k);

        return;
    }
}