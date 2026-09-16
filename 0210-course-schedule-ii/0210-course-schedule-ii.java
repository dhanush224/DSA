class Solution {
    int index=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] vis = new int[numCourses];
        int[] path = new int[numCourses];
        int[] order = new int[numCourses];

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numCourses;i++) list.add(new ArrayList<>());

        for(int[] pair: prerequisites){
            list.get(pair[0]).add(pair[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(vis[i]!=1){
                if(!recursion(i,list,vis,path,order)) return new int[]{};
            }
        }

        return order;
        
    }

    public boolean recursion(int node, List<List<Integer>> list, int[] vis, int[] path, int[] order){

        vis[node]=1;
        path[node]=1;

        for(int nei: list.get(node)){
            if(path[nei]==1) return false;
            if(vis[nei]!=1){
                if(!recursion(nei,list,vis,path,order)) return false;
            }
        }

        path[node]=0;
        order[index++]=node;


        return true;
    }
}