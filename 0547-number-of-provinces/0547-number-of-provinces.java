class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces=0;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++) adj.add(new ArrayList<>());
        int[] vis = new int[isConnected.length];
        adjacency(isConnected,adj);

        for(int i=0;i<isConnected.length;i++){
            if(vis[i]!=1){
                dfs(i,adj,vis);
                provinces++;
            }
        }

        
        return provinces;
    }

    public void dfs(int i,  List<List<Integer>> adj, int[] vis){

        vis[i]=1;
        for(int it: adj.get(i)){
            if(vis[it]!=1){
                dfs(it,adj,vis);
            }
        }
    }

    public void adjacency(int[][] isConnected, List<List<Integer>> adj){
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }    
        }
    }
}