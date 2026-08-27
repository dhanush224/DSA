class Solution {
    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        int n = rooms[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rooms[i][j]==0){
                    q.add(new int[]{i,j,0});
                }
            }
        }

        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] curr = q.remove();
                for(int[] d: dirs){
                    int nr = curr[0]+d[0];
                    int nc = curr[1]+d[1];
                    if(nr>=0 && nc>=0 && nr<m && nc<n && rooms[nr][nc]==Integer.MAX_VALUE){
                        rooms[nr][nc]=curr[2]+1;
                        q.add(new int[]{nr,nc,curr[2]+1});
                    }
                }
            }
        }
    }

}