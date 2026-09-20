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

        return recursion(preorder,inorder,0,preorder.length-1,0,inorder.length-1);

    }

    public TreeNode recursion(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd){
        if((preEnd<preStart) || (inEnd<inStart) || (preStart<0) || (preStart>=inorder.length)) return null;

    
        TreeNode root = new TreeNode(preorder[preStart]);
        int mid = Integer.MIN_VALUE;
        for(int i=inStart;i<=inEnd;i++){
            if(root.val==inorder[i]) {
                mid = i;
                break;
            }
        }
        root.left = recursion(preorder,inorder,preStart+1,preorder.length-1,inStart,mid-1);
        root.right = recursion(preorder,inorder,preStart+mid-inStart+1,preorder.length-1,mid+1,inEnd);

        return root;
    }
}