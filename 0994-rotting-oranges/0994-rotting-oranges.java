class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new ArrayDeque<>();

        boolean problem = false;
        int freshOranges=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) {
                    problem=true;
                    freshOranges++;
                }
            }
        } 
        if(problem==false) return 0;


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) q.add(new int[]{i,j});
            }
        } 

        int time=0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){

                int[] front = q.remove();
                for(int[] d: dirs){

                    int nr = front[0] + d[0];
                    int nc = front[1] + d[1];

                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                        freshOranges--;
                    }
                }
            }
            time++;
            if(freshOranges==0) break; 
        }

        if(freshOranges!=0) return -1;
        else return time;
    }
}