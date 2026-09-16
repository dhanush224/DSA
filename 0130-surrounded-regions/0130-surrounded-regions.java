class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] vis = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int j=0;j<n;j++) {
        if(board[0][j]=='O' && vis[0][j]!=1) {
            q.offer(new int[]{0,j});
            vis[0][j]=1;
        }}
        for(int j=0;j<n;j++) {
            if(board[m-1][j]=='O' && vis[m-1][j]!=1) {
            q.offer(new int[]{m-1,j});
            vis[m-1][j]=1;
        }}
        for(int i=0;i<m;i++){
            if(board[i][0]=='O' && vis[i][0]!=1){
                q.offer(new int[]{i,0});
                vis[i][0]=1;
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O' && vis[i][n-1]!=1){
                q.offer(new int[]{i,n-1});
                vis[i][0]=1;
            }
        }

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
                if(vis[i][j]!=1) board[i][j]='X';
            }
        }

    }

}