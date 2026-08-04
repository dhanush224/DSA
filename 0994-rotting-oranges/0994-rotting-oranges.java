class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new ArrayDeque<>();
        int m = grid.length;
        int n = grid[0].length;
        int rotten = 0;
        int fresh = 0;
        int[][] vis = new int[m][n];
        int minutes=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    rotten++;
                    q.add(new int[]{i,j});
                    vis[i][j]=1;
                }else if(grid[i][j]==1) fresh++;
            }
        }

        if(fresh==0) return 0;

        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int size = q.size();
            for(int k=0;k<size;k++){
                int[] curr = q.remove();
                for(int[] d: dirs){
                    int nr = curr[0]+d[0];
                    int nc = curr[1]+d[1];

                    if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==1 && vis[nr][nc]!=1){
                        grid[nr][nc]=2;
                        fresh--;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            minutes++;
        }

        if(fresh!=0) return -1;
        else return minutes-1;
    }
}