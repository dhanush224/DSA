class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] vis = new int[m][n];
        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(((i==0 || i==m-1) || (j==0 || j==n-1)) && vis[i][j]!=1 && board[i][j]=='O'){
                    vis[i][j]=1;
                    q.offer(new int[]{i,j});
                }
            }
        }
            System.out.println(q.size());
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                int[] curr = q.poll();

                for(int[] d: dirs){
                    int nr = curr[0]+d[0];
                    int nc = curr[1]+d[1];

                    if(nr>=0 && nr<m && nc>=0 && nc<n && board[nr][nc]=='O' && vis[nr][nc]!=1){
                        vis[nr][nc]=1;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }

        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(vis[i][j]!=1 && board[i][j]=='O') board[i][j]='X';
            }
        }

    }

}