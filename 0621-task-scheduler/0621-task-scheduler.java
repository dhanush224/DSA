class Solution {
    public int leastInterval(char[] tasks, int n) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(char c: tasks){
            if(!map.containsKey((int)c))
                map.put((int)c,1);
            else
                map.put((int)c,map.get((int)c)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int key: map.keySet()){
            pq.add(-1*map.get(key));
        }

        int time=0;
        Queue<int[]> q = new ArrayDeque<>();

        while(!pq.isEmpty()){
            int task = 1+pq.remove();
            time++;

            if(task!=0)q.add(new int[]{task,time+n});
            if(!q.isEmpty()){
                int[] arr = q.peek();

                while(pq.isEmpty() && time<arr[1])time++;

                if(time>=arr[1]) {
                    pq.add(arr[0]); 
                    q.remove();
                }
            }

        }
        return time;
    }
}