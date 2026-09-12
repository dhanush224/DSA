class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int prev=cost[0];
        int prev2=prev;
        for(int i=1;i<cost.length;i++){
            int ss = prev;
            if(i==1) ss =0;
            int ds = Integer.MAX_VALUE;
            if(i-2>=0) ds = prev2;
            prev2=prev;
            prev=cost[i]+Math.min(ss,ds); 
        }
        return Math.min(prev,prev2);        
    }


}