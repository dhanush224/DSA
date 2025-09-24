class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ret = new int[nums1.length];
        int[] nge = new int[nums2.length];
        Stack<Integer> s = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){

            while(!s.empty() && s.peek()<nums2[i]){
                System.out.println("Top: "+s.peek()+ "; nums2[i]:"+nums2[i]);
                s.pop();
            }
            if(s.empty()){
                nge[i]=-1;
            } 
            else nge[i]=s.peek();

            s.push(nums2[i]);
            
        }

        for(int i=0;i<nge.length;i++){
            System.out.print(nge[i]+",");
        }

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ret[i]=nge[j];
                }
            }
        }

        return ret;


        
    }
}