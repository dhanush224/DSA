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
        
        int[] result = recursion(root,0,0);

        return result[1]-1;
    }

    public int[] recursion(TreeNode node, int maxLength, int maxDiameter){
        if(node==null) {
            int[] arr = new int[2];
            return arr;
        }

        int[] arr = new int[2];
        int[] arrx = recursion(node.left,maxLength,maxDiameter);
        int[] arry = recursion(node.right,maxLength,maxDiameter);

        maxLength = 1+Math.max(arrx[0],arry[0]);
        int diameter = 1+arrx[0]+arry[0];
        maxDiameter=Math.max(diameter,Math.max(arrx[1],arry[1]));
        arr[0] = maxLength;
        arr[1] = maxDiameter;

        return arr;

    }
}