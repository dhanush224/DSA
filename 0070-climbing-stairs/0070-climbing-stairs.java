class Solution {
    public int climbStairs(int n) {
        int[] memory = new int[n+1];
        memory[1]=1;
        int prev = 1;
        int prev2 = 1;
        for(int i=1;i<=n;i++){
            if(memory[i]==0){
                memory[i]=prev+prev2;
                prev2=prev;
                prev=memory[i];
            }
        }

        return memory[n];
        
    }
}