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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if(root==null) return list;

        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        st.push(root);
        node=node.left;

        while(!st.empty()){

            if(node!=null){
                if(!st.empty() && st.peek()==node){
                    TreeNode right = node.right;
                    node=right;              
                    // if(right!=null && right.val!=list.get(list.size()-1)){
                    //     node=right;
                    // }
                    // else{
                    //     list.add((st.pop().val));
                    //     if(st.empty())break;
                    //     node=st.peek();
                    // }
                }else{
                    st.push(node);
                    node=node.left;
                }
            }
            else{
                if(st.empty()) break;
                node=st.peek();
                node=node.right;
                if(node==null){
                    TreeNode temp = st.pop();
                    list.add(temp.val);
                    if(st.empty()) break;
                    node=st.peek();
                    while(!st.empty() && node.right==temp){
                        temp = st.pop();
                        list.add(temp.val);
                        if(st.empty()) break;
                        node=st.peek();
                    }

                }
            }
        }

        return list;     
    }
}