class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int[][] vis = new int[grid.length][grid[0].length];
        int land=0;

        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) land++;
                if(vis[i][j]!=1 && grid[i][j]==1 && (i==0 ||j==0 || i==grid.length-1 || j==grid[0].length-1)){
                    vis[i][j]=1;
                    land--;
                    q.add(new int[]{i,j});
                    land=bfs(grid,q,vis,land);
                }
            }
        }

        return land;        
    }

        public int bfs(int[][] grid, Queue<int[]> q, int[][] vis, int land){

            int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

            while(!q.isEmpty()){

                int[] curr = q.remove();

                for(int[] d: dirs){
                    int nr = curr[0] + d[0];
                    int nc = curr[1] + d[1];

                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1 && vis[nr][nc]!=1){
                        land--;
                        vis[nr][nc]=1;
                        q.add(new int[]{nr,nc});
                    }
                }
            }

            return land;
        }
}