class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> frequency = new HashMap<>();
        for(char c : tasks){
            if(!frequency.containsKey(c)){
                frequency.put(c,1);
            }else{
                frequency.put(c,1+frequency.get(c));
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int value: frequency.values()){
            pq.add(-1*value);
        }

        Queue<int[]> q = new ArrayDeque<>();

        int time=0;
        while(!pq.isEmpty()){
            int remainingFreq = 1+pq.remove();
            time++;

            if(remainingFreq!=0) q.add(new int[]{remainingFreq,time+n});

            while(pq.isEmpty() && !q.isEmpty() && time<q.peek()[1]){
                time++;
            }

            while(!q.isEmpty() && time>=q.peek()[1]){
                pq.add(q.peek()[0]);
                q.remove();
            }

            
        }

        return time;

    }
}