class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] vis = new int[numCourses];
        int[] studied = new int[numCourses];
        int m = prerequisites.length;
        int n = 2;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<m;i++){
            if(map.containsKey(prerequisites[i][0])){
                List<Integer> list = map.get(prerequisites[i][0]);
                list.add(prerequisites[i][1]);
                map.put(prerequisites[i][0],list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][1]);
                map.put(prerequisites[i][0],list);
            } 
        }

        int[] ret = new int[numCourses];
        int[] index=new int[]{0};
        boolean b = true;
        for(int i=0;i<numCourses;i++){
            b=b&&recursion(i,map,vis,studied,ret,index);
            if(b==false) break;
        }

        if(b==true) return ret;
        else return new int[]{};

    }

    public boolean recursion(int node, Map<Integer, List<Integer>> map, int[] vis, int[] studied, int[] ret, int[] index){
        
        if(vis[node]==1 && studied[node]!=1)return false;
        else if(vis[node]==1 && studied[node]==1) return true;

        vis[node]=1;
        boolean b = true;

        if(!map.containsKey(node)){
            studied[node]=1;
            ret[index[0]]=node;
            index[0]++;
            return true;
        }

        for(int nei: map.get(node)){
            b = b && recursion(nei,map,vis,studied,ret,index);
            if(b==false) break;
        }

        if(b==true){
            studied[node]=1;
            ret[index[0]]=node;
            index[0]++;
        }    
        return b;
    }

}