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
    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null) return 0;

        int[] arr = recursion(root);

        return arr[1];    
    }

    public int[] recursion(TreeNode node){
        if(node==null) return new int[]{-1,0};

        int[] left = recursion(node.left);
        int leftH = 1+left[0];
        int[] right = recursion(node.right);
        int rightH = 1+right[0];

        int height1 = leftH+rightH;
        int height2 = Math.max(leftH,rightH);
        height1 = Math.max(height1,Math.max(left[1],right[1]));
        int[] arr = new int[]{height2,height1};

        return arr;
    }

}