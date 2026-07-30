class Solution {
    public int numIslands(char[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length];
        int islands=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && vis[i][j]!=1){
                    bfs(i,j,grid,vis);
                    islands++;
                }
            }
        }  
        return islands;      
    }

    public void bfs(int i, int j, char[][] grid, int[][] vis){
        vis[i][j]=1;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{i,j});
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int[] curr = q.remove();

            for(int[] d: dirs){
                int nr = curr[0] + d[0];
                int nc = curr[1] + d[1];

                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='1' && vis[nr][nc]!=1){
                    vis[nr][nc]=1;
                    q.add(new int[]{nr,nc});
                } 
            }
        }

    }
}