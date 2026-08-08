class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int maxArea = 0;
        int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]!=1){
                    maxArea = Math.max(maxArea, dfs(grid,vis,i,j,m,n,1,dirs));
                }
            }
        }
        return maxArea;        
    }

    public int dfs(int[][] grid, int[][] vis, int i, int j, int m, int n, int area, int[][] dirs){

        vis[i][j]=1;        
        for(int[] d: dirs){
            int nr = i+d[0];
            int nc = j+d[1];

            if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==1 && vis[nr][nc]!=1){
                area=dfs(grid,vis,nr,nc,m,n,area+1,dirs);
            }
        }

        return area;
    }
}