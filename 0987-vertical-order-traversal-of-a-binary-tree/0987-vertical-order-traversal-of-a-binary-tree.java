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
 public class Tuple{
    TreeNode node;
    int row;
    int col;
    Tuple(TreeNode n, int r, int c){
        this.node = n;
        this.row = r;
        this.col = c;
    }
 }

class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;

        Map<Integer, TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(root,0,0));

        while(!queue.isEmpty()){
            Tuple t = queue.remove();
            TreeNode node = t.node;
            int row = t.row;
            int col = t.col;

            if(map.containsKey(col)){
                TreeMap<Integer,PriorityQueue<Integer>> m = map.get(col);
                PriorityQueue<Integer> q = new PriorityQueue<>();
                if(m.containsKey(row)){
                    q=m.get(row);
                }
                q.add(node.val);
                m.put(row,q);
                map.put(col,m);
            }else{
                TreeMap<Integer,PriorityQueue<Integer>> m = new TreeMap<>();
                PriorityQueue<Integer> q = new PriorityQueue<>();
                q.add(node.val);
                m.put(row,q);
                map.put(col,m);
            }

            if(node.left!=null) queue.add(new Tuple(node.left,row+1,col-1));
            if(node.right!=null) queue.add(new Tuple(node.right,row+1,col+1));

        }

        for(TreeMap<Integer,PriorityQueue<Integer>> tMap: map.values()){
            List<Integer> innerList = new ArrayList<>();
            for(PriorityQueue<Integer> q: tMap.values()){
                int n = q.size();
                for(int i=0;i<n;i++){
                    int val = q.remove();
                    innerList.add(val);
                }

            }
            list.add(innerList);

        }

        return list;
    }
}