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
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root==null) return new TreeNode(val);

        TreeNode node = root;
        int floor=-1;
        int ceil=-1;

        while(node!=null){
            if(node.val<val){
                floor=node.val;
                node=node.right;
            }else{
                ceil=node.val;
                node=node.left;
            }
        }


        node=root;

        if(floor==-1){
            while(node.left!=null) node=node.left;
            node.left=new TreeNode(val);
        }else if(ceil==-1){
            while(node.right!=null) node=node.right;
            node.right=new TreeNode(val);
        }else{
            while(node!=null){
                // if(node.val==floor && node.right!=null && node.right.val==ceil){
                //     TreeNode temp = node.right;
                //     node.right=new TreeNode(val);
                //     node.right.right=temp;
                //     break;
                // }else if(node.val==ceil && node.left!=null && node.left.val==floor){
                //     TreeNode temp = node.left;
                //     node.left = new TreeNode(val);
                //     node.left.left=temp;
                //     break;
                // }else 
                if(node.val<val){
                    if(node.right!=null)
                        node=node.right;
                    else {
                        node.right=new TreeNode(val);
                        break;
                    }
                }else if(node.val>val){
                    if(node.left!=null)
                        node=node.left;
                    else{
                        node.left=new TreeNode(val);
                        break;
                    } 
                }
            }
        }

        return root;
        
    }
}