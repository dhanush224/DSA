class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int st: stones) pq.add(-1*st);

        while(pq.size()>=2){
            int x = -1*pq.remove();
            int y = -1*pq.remove();
            int ele=0;
            if(x>y){
                ele = x-y;
            }else if(y>x){
                ele = y-x;
            }

            if(x!=y){
                pq.add(-1*ele);
            }
        }

        if(pq.size()==1) return -1*pq.peek();
        else return 0;
        
    }
}