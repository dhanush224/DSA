class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int islands=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]!=1){
                    bfs(i,j,grid,vis,m,n);
                    islands++;
                }
            }
        }  
        return islands;      
    }

    public void bfs(int i, int j, char[][] grid, int[][] vis,int m, int n){
        vis[i][j]=1;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{i,j});
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int[] curr = q.remove();

            for(int[] d: dirs){
                int nr = curr[0] + d[0];
                int nc = curr[1] + d[1];

                if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]=='1' && vis[nr][nc]!=1){
                    vis[nr][nc]=1;
                    q.add(new int[]{nr,nc});
                } 
            }
        }

    }
}