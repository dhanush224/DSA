class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int[][] vis = new int[m][n];
        int[][] ret = new int[m][n];
        List<List<Integer>> list = new ArrayList<>();

        //pacific
        for(int i=0;i<n;i++) bfs(0,i,heights,vis,ret,list);
        for(int i=0;i<m;i++) bfs(i,0,heights,vis,ret,list);
        vis = new int[m][n];
        //atlantic
        for(int i=0;i<m;i++) bfs(i,n-1,heights,vis,ret,list);
        for(int i=0;i<n;i++) bfs(m-1,i,heights,vis,ret,list);


        return list;

    }

    public void bfs(int i, int j, int[][] heights, int[][] vis, int[][] ret, List<List<Integer>> list){
        if(vis[i][j]==1) return;
        vis[i][j]=1;
        ret[i][j]++;

        if(ret[i][j]==2){
            List<Integer> l = new ArrayList<>(List.of(i,j));
            list.add(l);
        }
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{i,j});
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int[] curr = q.remove();

            for(int[] d: dirs){
                int nr = curr[0] + d[0];
                int nc = curr[1] + d[1];

                if(nr>=0 && nc>=0 && nr<heights.length && nc<heights[0].length && vis[nr][nc]!=1 && heights[nr][nc]>=heights[curr[0]][curr[1]]){
                    vis[nr][nc]=1;
                    ret[nr][nc]++;
                    if(ret[nr][nc]==2){
                        List<Integer> l = new ArrayList<>(List.of(nr,nc));
                        list.add(l);
                    }
                    q.add(new int[]{nr,nc});
                }
            }

        }

    }


}