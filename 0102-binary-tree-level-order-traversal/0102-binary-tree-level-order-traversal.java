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
    Queue<TreeNode> q = new LinkedList<>();
    List<List<Integer>> outerList = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root==null) return outerList;

        List<Integer> list = new ArrayList<>();

        if(q.size()==0) q.add(root);

        int n = q.size();

        for(int i=0;i<n;i++){
            if(q.peek().left!=null) q.add(q.peek().left);
            if(q.peek().right!=null) q.add(q.peek().right);
            list.add(q.remove().val);
            
        }

        outerList.add(new ArrayList<>(list));
        if(q.size()==0) return outerList;
        levelOrder(root);
        
        return outerList;

    }
}