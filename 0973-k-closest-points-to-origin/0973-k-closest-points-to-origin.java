class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare( (b[0]*b[0]+b[1]*b[1]), (a[0]*a[0]+a[1]*a[1]) ));

        for(int[] arr: points) {
            pq.add(arr);
            if(pq.size()>k) pq.remove();
        }


        int[][] ret = new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            ret[i] = pq.remove();
            i++;
        }

        return ret;
        
    }
}