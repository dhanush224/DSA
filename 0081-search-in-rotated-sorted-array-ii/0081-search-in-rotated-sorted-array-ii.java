class Solution {
    public boolean search(int[] nums, int target) {
        int low = 1, high = nums.length-1;
        int smallestIndex=0;
        int rotatedFlag=-1;

        if(nums.length==1){
            if(nums[0]==target) return true;
            else return false;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                smallestIndex=i+1;
            }
        }

        if(smallestIndex!=0) rotatedFlag=1;

        System.out.println("Smallest Index: "+smallestIndex);

        if(target<nums[0] || rotatedFlag==-1){
            low=smallestIndex; high=nums.length-1;

            while(low<=high){
                int mid=low+(high-low)/2;

                if(nums[mid]==target){
                    return true;
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
                System.out.println("Mid: "+mid);
                if(nums[mid]==target){
                    return true;
                }else if(nums[mid]>target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }

        return false;
    }
}