class Solution {
    public void solve(char[][] board) {
        
        int[][] vis = new int[board.length][board[0].length];

        //start the traversals
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O' && vis[i][j]!=1){
                    if(i!=0 && j!=0 && i!=board.length-1 && j!=board[0].length-1){  
                        List<int[]> regionList = new ArrayList<>();                    
                        if(dfs(i,j, board, regionList,vis,-1)!=0){
                            //convert Os to Xs
                            regionList.add(new int[]{i,j});
                            convert(board,regionList);
                        }
                    }

                } 
            }
        }
        
    }

    public int dfs(int i, int j, char[][] board, List<int[]> regionList, int[][] vis, int flag){
        int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        vis[i][j]=1;
        
        for(int[] d: dirs){
            int nr = i+d[0];
            int nc = j+d[1];

            if(nr>=0 && nc>=0 && nr<board.length && nc<board[0].length && board[nr][nc]=='O' && vis[nr][nc]!=1){

                if(nr==0 || nc==0 || nr==board.length-1 || nc==board[0].length-1){
                    //not a region
                    flag=0;
                    flag = dfs(nr,nc,board,regionList,vis,flag);
                }else{
                    regionList.add(new int[]{nr,nc});
                    flag = dfs(nr,nc,board,regionList,vis,flag);
                }
            }
        }

        return flag;
    }

    public void convert(char[][] board, List<int[]> regionList){
        for(int[] cell: regionList){
            board[cell[0]][cell[1]] = 'X';
        }
        regionList = new ArrayList<>();
    }
}