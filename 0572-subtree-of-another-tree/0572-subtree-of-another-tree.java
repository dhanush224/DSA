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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null && subRoot==null) return true;
        else if(root==null) return false;
        else if(subRoot==null) return true;

        return dfs(root,subRoot);
    }

    public boolean dfs(TreeNode node, TreeNode subNode){

        boolean sub=false;
        boolean l = false;
        boolean r = false;
        if(node.val==subNode.val) sub = subDFS(node,subNode);
        if(sub==true)return true;
        if(node.left!=null) l = dfs(node.left,subNode);
        if(node.right!=null) r = sub=dfs(node.right,subNode);

        if(l || r)return true;
        else return false;
    }

    public boolean subDFS(TreeNode node, TreeNode subNode){
        
        if(node==null && subNode==null)return true;
        else if(node==null || subNode==null)return false;

        if(node.val!=subNode.val) return false;

        boolean l = subDFS(node.left,subNode.left);
        boolean r = subDFS(node.right,subNode.right);

        if(l==true && r==true) return true;
        else return false;
    }
}