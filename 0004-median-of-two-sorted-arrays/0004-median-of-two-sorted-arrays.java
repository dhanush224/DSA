class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {  


        if(nums1.length>nums2.length){
            int[] temp = nums1;
            nums1=nums2;
            nums2=temp;
        }
        int m = nums1.length;
        int n = nums2.length;
        int low=0;
        int high=m-1;
        int length = (m+n)/2;

        while(true){
            int mid1 = (int) Math.floor((high+low)/2.0);
            int mid2 = length-mid1-2;
            int left1 = (mid1>=0) ? nums1[mid1] : Integer.MIN_VALUE;
            int right1 = (mid1+1<m)? nums1[mid1+1] : Integer.MAX_VALUE;
            int left2 = (mid2>=0) ? nums2[mid2] : Integer.MIN_VALUE;
            int right2 = (mid2+1<n) ? nums2[mid2+1] : Integer.MAX_VALUE;


            if(left1<=right2 && left2<=right1){
                if((m+n)%2==0) return (Math.max(left1,left2)+Math.min(right1,right2))/(double)2;
                else return Math.min((double)right1,(double)right2);
            }else if(left1>right2){
                high=mid1-1;
                System.out.println("high:"+high+","+low);
            }else{
                low=mid1+1;
            }
        }




    }
        
}