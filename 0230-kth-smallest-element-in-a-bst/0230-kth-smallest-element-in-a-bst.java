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
        recursion(root,list,0,k);
        return list.get(list.size()-1);        
    }

    public int recursion(TreeNode node, List<Integer> list, int count, int k){
        if(node==null) return count;

        if(count==k) return count;
        count=recursion(node.left,list,count,k);
        if(count==k) return count;
        list.add(node.val);
        count++;
        if(count==k) return count;
        count=recursion(node.right,list,count,k);

        return count;
    }
}