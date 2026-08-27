class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] vis = new int[n];
        
        vis[0]=1;
        boolean b = dfs(0,adj,-1,vis);
        for(int i=0;i<n;i++){
            if(vis[i]!=1){
                return false;
            }
        }

        return b;
        
    }

    public boolean dfs(int node, List<List<Integer>> adj, int prev, int[] vis){

        for(int n: adj.get(node)){
            if(vis[n]==1 && n!=prev){
                return false;
            } 
            if(vis[n]!=1){
                vis[n]=1;
                if(!dfs(n,adj,node,vis)) return false;
            }
        }

        return true;
        
    }
}