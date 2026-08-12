class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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

        System.out.println(map);

        boolean b = true;
        for(int i=0;i<numCourses;i++){
            b=b&&recursion(i,map,vis,studied);
            if(b==false) break;
        }

        return b;

    }

    public boolean recursion(int node, Map<Integer, List<Integer>> map, int[] vis, int[] studied){
        
        if(vis[node]==1 && studied[node]!=1)return false;
        else if(vis[node]==1 && studied[node]==1) return true;

        vis[node]=1;
        boolean b = true;

        if(!map.containsKey(node)){
            studied[node]=1;
            return true;
        }

        for(int nei: map.get(node)){
            b = b && recursion(nei,map,vis,studied);
            if(b==false) break;
        }

        if(b==true)studied[node]=1;
        return b;
    }


    
}