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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        return recursion(preorder,inorder,0,preorder.length-1,0,inorder.length-1, map);

    }

    public TreeNode recursion(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd, Map<Integer,Integer> map){
        if((preEnd<preStart) || (inEnd<inStart) || (preStart<0) || (preStart>=inorder.length)) return null;

    
        TreeNode root = new TreeNode(preorder[preStart]);
        int mid = Integer.MIN_VALUE;
        mid=map.get(root.val);
        root.left = recursion(preorder,inorder,preStart+1,preorder.length-1,inStart,mid-1,map);
        root.right = recursion(preorder,inorder,preStart+mid-inStart+1,preorder.length-1,mid+1,inEnd,map);

        return root;
    }
}