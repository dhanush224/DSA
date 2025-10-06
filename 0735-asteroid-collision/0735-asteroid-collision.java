class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();
        
        int n = asteroids.length;
        for(int i=0;i<n;i++){
            int curr=asteroids[i];
            int eqto=-1;
            while(!st.empty() && st.peek()>0 && curr<0){
                eqto=-1;
                if(Math.abs(curr)>Math.abs(st.peek())){
                    st.pop();
                }else if(Math.abs(curr)==Math.abs(st.peek())){
                    st.pop();
                    eqto=1;
                    break;                 
                }else{
                    curr=st.pop();                            
                }
            }
            if(eqto==-1){
                st.push(curr);
            }
        }


        int[] ret = new int[st.size()];
        int m = st.size();
        for(int i=m-1;i>=0;i--){
            ret[i]=st.pop();
        }

        return ret;
        
    }
}