class Solution {
    int index=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<Integer> ret = new ArrayList<>();
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<numCourses;i++) adjList.add(new ArrayList<>());

        for(int[] pair: prerequisites)adjList.get(pair[1]).add(pair[0]);

        int[] vis = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]!=1){
                if(!recursion(i, adjList,vis,ret)) return new int[]{};
            }
        }

        int[] order = new int[numCourses];

        for(int i=0;i<numCourses;i++) order[i]=ret.get(numCourses-i-1);
        return order;
    
    }

    public boolean recursion(int i, List<List<Integer>> adjList, int[] vis, List<Integer> ret){

        vis[i]=2;

        for(int nei: adjList.get(i)){
            if(vis[nei]==2) return false;
            if(vis[nei]==0){
                if(!recursion(nei,adjList,vis,ret)) return false;
            }
        }

        vis[i]=1;
        ret.add(i);
        return true;
    }



}