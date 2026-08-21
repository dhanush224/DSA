class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare((a[0]*a[0]+a[1]*a[1]),(b[0]*b[0]+b[1]*b[1]) ));

        for(int[] arr: points) pq.add(arr);


        int[][] ret = new int[k][2];
        int i=0;
        while(k>0){
            ret[i] = pq.remove();
            i++;
            k--;
        }

        return ret;
        
    }
}