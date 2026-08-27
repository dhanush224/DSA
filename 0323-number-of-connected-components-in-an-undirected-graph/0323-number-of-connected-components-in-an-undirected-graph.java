class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList<>();
        int[] vis = new int[n];
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            adjList.get(edge[1]).add(edge[0]);
            adjList.get(edge[0]).add(edge[1]);
        }
        int components=0;
        for(int i=0;i<n;i++){
            if(vis[i]!=1){
                dfs(i,adjList,vis);
                components++;
            }
        }  

        return components;      
    }

    public void dfs(int key, List<List<Integer>> adjList, int[] vis){
        vis[key]=1;
        for(int n: adjList.get(key)){
            if(vis[n]!=1)
                dfs(n,adjList,vis);
        }

    }
}