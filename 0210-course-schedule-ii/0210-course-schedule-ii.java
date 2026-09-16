class Solution {
    int index=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] indegree = new int[numCourses];

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numCourses;i++) list.add(new ArrayList<>());
        for(int[] pair: prerequisites) {
            indegree[pair[0]]++;
            list.get(pair[1]).add(pair[0]);
        }


        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.offer(i);
        }

        int[] order = new int[numCourses];
        List<Integer> ret = new ArrayList<>();
        while(!q.isEmpty()){
            int course = q.poll();
            ret.add(course);
            for(int nei: list.get(course)){
                if(--indegree[nei]==0)q.offer(nei);
            }

        }


        if(ret.size()<numCourses) return new int[]{};
        else {
            for(int i=0;i<numCourses;i++) order[i]=ret.get(i);
            return order;
        }
    }

}