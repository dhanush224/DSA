class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first =-1, last =-1;
        int low =0, high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            // System.out.println("Mid: "+mid);
            if(nums[mid]==target){
                first=mid;
                high = mid-1;
                // System.out.println("First::::"+first);
            }else if(nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
            // System.out.println("Low: "+low+ " Mid: "+mid+" High: "+high);
        }

        if(first==-1) last=-1;
        low =0; high = nums.length-1;

        while(low<=high){
            if(first ==-1)break;
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }else if(nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        int[] arr1 = {first, last};
        return arr1;
 
    }
}