class Solution {
    public int findCircleNum(int[][] isConnected) {
        int size = isConnected[0].length;
        int[] vis = new int[size];
        int provinces=0;

        List<List<Integer>> adj = new ArrayList<>();
        adjacency(isConnected,adj);

        for(int i=0;i<size;i++){
            if(vis[i]!=1){
                dfs(i,vis,adj);
                provinces++;
            }
        }

        return provinces;
    }

    public void adjacency(int[][] isConnected, List<List<Integer>> adj){
        int size = isConnected[0].length;

        for(int i=0;i<size;i++){
            adj.add(new ArrayList<>());
            for(int j=0;j<size;j++){
                if(i!=j && isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }
    }

    public void dfs(int node,int[] vis, List<List<Integer>> adj){
        vis[node]=1;
        for(int it: adj.get(node)){
            if(vis[it]!=1) dfs(it,vis,adj);
        }
    }
}