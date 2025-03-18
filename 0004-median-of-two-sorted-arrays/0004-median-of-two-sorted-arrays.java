class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();

        int time = 0;
        for(int i=0,j=0; i<nums1.length || j<nums2.length; i++,j++){
            // System.out.println("Entered loop");
            if(i>=nums1.length) {
                // System.out.println("Inside first if");
                arr.add(nums2[j]);
                time++;
                // System.out.println(arr); 
                continue;
            }
            if(j>=nums2.length){
                arr.add(nums1[i]);
                time++;
                // System.out.println(arr); 
                continue;
            } 

            if(nums1[i]<nums2[j]){
                arr.add(nums1[i]);
                j--;
            }else{
                arr.add(nums2[j]);
                i--;
            }
            time++;
            // System.out.println(arr);    
        }
        System.out.println("Time"+ time);
        double median =0;
        if(arr.size()%2==0){
            median = (arr.get(arr.size()/2 - 1) + arr.get(arr.size()/2 ) )/2.0;
        }else{
            median = arr.get(arr.size()/2 );
        }

        return median;
        
    }
}