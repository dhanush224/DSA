class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();
        
        // st.push(asteroids[0]);

        int n = asteroids.length;
        for(int i=0;i<n;i++){
            int curr=asteroids[i];
            int eqto=-1;
            while(!st.empty() && Math.signum(st.peek())==1.0 && Math.signum(curr)==-1.0){
                eqto=-1;
                if(Math.abs(curr)>Math.abs(st.peek())){
                    st.pop();
                }else if(Math.abs(curr)==Math.abs(st.peek())){
                    st.pop();
                    eqto=1;
                    
                    System.out.println("Stack size: "+st.size());   
                    break;                 
                }else{
                    curr=st.pop();                            
                }
            }
            System.out.println("eqto: "+eqto);
            if(eqto==-1){
                st.push(curr);
                System.out.println("Added: "+curr);
            }
            System.out.println("Stack size: "+st.size());
        }


        int[] ret = new int[st.size()];
        int m = st.size();
        for(int i=m-1;i>=0;i--){
            ret[i]=st.pop();
        }

        return ret;
        
    }
}