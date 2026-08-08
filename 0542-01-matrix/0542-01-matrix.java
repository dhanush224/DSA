class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] vis = new int[m][n];
        int[][] ret = new int[m][n];
        Queue<int[]> q = new ArrayDeque<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0 && vis[i][j]!=1){
                    vis[i][j]=1;
                    ret[i][j]=0;
                    q.add(new int[]{i,j});
                    
                }
            }
        }
        bfs(mat, vis, ret, q, m , n);

        return ret;
    }

    public void bfs(int[][] mat, int[][] vis, int[][] ret, Queue<int[]> q, int m, int n){

        int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
            int[] curr = q.remove();

            for(int[] d : dirs){
                int nr = curr[0]+d[0];
                int nc = curr[1]+d[1];

                if(nr>=0 && nc>=0 && nr<m && nc<n && vis[nr][nc]!=1){
                    q.add(new int[]{nr,nc});
                    if(mat[curr[0]][curr[1]]==0){
                        if(mat[nr][nc]==0){
                            vis[nr][nc]=1;
                            ret[nr][nc]=0;
                        }else{
                            ret[nr][nc]=1;
                            vis[nr][nc]=1;
                        }
                    }else{
                        if(mat[nr][nc]==0){
                            vis[nr][nc]=1;
                            ret[nr][nc]=0;
                        }else{
                            ret[nr][nc]=ret[curr[0]][curr[1]]+1;
                            vis[nr][nc]=1;
                        }

                    }

                }
            }
            }
        }
    }
}