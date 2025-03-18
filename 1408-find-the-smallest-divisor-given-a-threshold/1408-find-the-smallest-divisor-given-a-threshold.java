class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int largest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest) largest = nums[i];
        }

        // System.out.println("Largest: "+ largest);

        int low=1, high = largest;
        while(low<=high){
            int mid = low+(high-low)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum += (int) Math.ceil((double)nums[i]/mid);
                // System.out.println("---Sum: "+ sum);
            }

            // System.out.println("Mid: "+mid+"; Sum: "+ sum );

            if(sum==threshold){
                high=mid-1;
            }else if(sum>threshold){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return low;
    }

    //     int largest = nums[0];
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]>largest) largest =nums[i];
    //     }

    //     int low =1, high = largest;
    //     int mid = low + (high-low)/2;
    //     int smallestDiv = mid;
    //     while(low<=high){
    //         mid = low + (high-low)/2;
    //         int sum=0;
    //         for(int i=0;i<nums.length;i++){
    //             sum=+ (int) Math.ceil(nums[i]/mid);
    //         }

    //         if(sum==threshold){
    //             return mid;
    //         }else if(sum>threshold){
    //             low=mid+1;
    //         }else{
    //             if(mid<smallestDiv) smallestDiv = mid;
    //         }
    //     }

    //     return smallestDiv;
        
    // }
}