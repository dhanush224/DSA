class Solution {
    public int search(int[] nums, int target) {

        int low = 1, high = nums.length-1;
        int smallestIndex=0;
        int rotatedFlag=-1;

        if(nums.length==1){
            if(nums[0]==target) return 0;
            else return -1;
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid-1]>nums[mid]){
                smallestIndex=mid;
                rotatedFlag=1;
                break;
            }else if(nums[mid]<nums[0]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        System.out.println("Smallest Index: "+smallestIndex);

        if(target<nums[0] || rotatedFlag==-1){
            low=smallestIndex; high=nums.length-1;

            while(low<=high){
                int mid=low+(high-low)/2;

                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid]>target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }else{
            low=0; high=smallestIndex-1;

            while(low<=high){
                int mid=low+(high-low)/2;

                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid]>target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }

        return -1;
    }
 
}