class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {  
        if(nums1.length>nums2.length){
            int[] temp = nums1;
            nums1=nums2;
            nums2=temp;
        }

        int low =0;
        int high = nums1.length-1;
        while(true){
            int mid=(int)Math.floor((low+high)/2.0);
            int mid2 = (nums1.length+nums2.length)/2;
            mid2=mid2-mid-2;

            int n1Left = (mid>=0)? nums1[mid]:Integer.MIN_VALUE;
            int n1Right = (mid+1<nums1.length)? nums1[mid+1]: Integer.MAX_VALUE;
            int n2Left = (mid2>=0)? nums2[mid2]:Integer.MIN_VALUE;
            int n2Right = (mid2+1<nums2.length)? nums2[mid2+1]:Integer.MAX_VALUE;

            if(n1Left<=n2Right && n2Left<=n1Right){
                if((nums1.length+nums2.length)%2==0){
                    return (Math.max(n1Left,n2Left)+Math.min(n1Right,n2Right))/2.0;
                }else return (double)Math.min(n1Right,n2Right);
            }else if(n1Left>n2Right){
                high=mid-1;
            }else low=mid+1;
        }
    }
}