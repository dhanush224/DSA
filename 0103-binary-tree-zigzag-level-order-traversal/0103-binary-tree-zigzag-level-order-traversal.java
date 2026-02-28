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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> outerList = new ArrayList<>();
        if(root==null) return outerList;

        Deque<TreeNode> q = new ArrayDeque<>();
        
        q.add(root);
        int level=0;

        while(q.size()!=0){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for(TreeNode node: q){
                list.add(node.val);
            }
            if(level%2!=0) Collections.reverse(list);
            outerList.add(new ArrayList<>(list));

            for(int i=0;i<n;i++){
                TreeNode node = q.remove();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }

            level++;
        }

        return outerList;        
    }

}