class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int islands=0;
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]!=1){
                    dfs(i,j,grid,vis,m,n,dirs);
                    islands++;
                }
            }
        }  
        return islands;      
    }

    public void dfs(int i, int j, char[][] grid, int[][] vis, int m, int n, int[][] dirs){
        vis[i][j]=1;

        for(int[]  d: dirs){
            int nr = i+d[0];
            int nc = j+d[1];

            if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]=='1' && vis[nr][nc]!=1) dfs(nr,nc,grid,vis,m,n,dirs);
        }


    }

}