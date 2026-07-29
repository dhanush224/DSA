class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{sr,sc});
        int original = image[sr][sc];

        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] front = q.remove();
            image[front[0]][front[1]]=color;


            for(int[] d: dirs){
                int nr = front[0]+d[0];
                int nc = front[1]+d[1];
                
                if(nr>=0 && nr<image.length && nc>=0 && nc<image[0].length && image[nr][nc]==original){
                    q.add(new int[]{nr,nc});
                }
            }
        }

        return image;
    } 
}