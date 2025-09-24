class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ret = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        int n=nums2.length;
        for(int i=n-1;i>=0;i--){

            while(!s.empty() && s.peek()<nums2[i]){
                System.out.println("Top: "+s.peek()+ "; nums2[i]:"+nums2[i]);
                s.pop();
            }
            if(s.empty()){
                map.put(nums2[i],-1);
            } 
            else map.put(nums2[i],s.peek());

            s.push(nums2[i]);
            
        }

        for(int i=0;i<ret.length;i++){
            ret[i]=map.get(nums1[i]);
        }

        return ret;


        
    }
}