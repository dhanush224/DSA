class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int maxArea=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]!=1) maxArea = Math.max(maxArea,dfs(i,j,grid,vis,0));
            }
        }

        return maxArea;
    }

    public int dfs(int i, int j, int[][] grid, int[][] vis, int area){
        vis[i][j]=1;
        area++;

        int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

        for(int[] d: dirs){
            int nr = i+d[0];
            int nc = j+d[1];

            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1 && vis[nr][nc]!=1){
                area = dfs(nr,nc,grid,vis,area);
            }
        }

        return area;
    }
}