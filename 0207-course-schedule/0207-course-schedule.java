class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numCourses;i++) list.add(new ArrayList<>());

        for(int[] courses: prerequisites){
            list.get(courses[0]).add(courses[1]);
        }

        int[] vis = new int[numCourses];
        int[] path = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]!=1){
                if(!recursion(i,list,vis,path)) return false;
            }
            
        }
        return true;
    }

    public boolean recursion(int node,List<List<Integer>> list, int[] vis, int[] path){

        vis[node]=1;
        path[node]=1;
        for(int nei: list.get(node)){
            if(path[nei]==1) return false;
            if(vis[nei]!=1 ){
                if(!recursion(nei,list,vis,path)) return false;;
            }
        }
        path[node]=0;
        return true;
    }
}