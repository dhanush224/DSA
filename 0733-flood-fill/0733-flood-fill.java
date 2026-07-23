class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc]==color) return image;

        Queue<int[]> q = new ArrayDeque<>();
        int m = image.length;
        int n = image[0].length;
        int[][] ret = new int[m][n];
        int original=image[sr][sc];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ret[i][j] = image[i][j];
            }
        }

        ret[sr][sc] = color;
        q.add(new int[]{sr,sc});

        int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
                int[] arr = q.poll();
                int r=arr[0];
                int c=arr[1];

                for(int[] d: dirs){
                    int nr = r+d[0];
                    int nc = c+d[1];

                    if(nr>=0 && nr<m && nc>=0 && nc<n && ret[nr][nc]==original){
                        ret[nr][nc]=color;
                        q.add(new int[]{nr,nc});
                    }
                }

        }

        return ret;
        
    } 
}