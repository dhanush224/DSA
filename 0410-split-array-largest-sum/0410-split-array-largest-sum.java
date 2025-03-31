class Solution {
    public int splitArray(int[] nums, int k) {

        int low = nums[0], high=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>low) low=nums[i];
            high+=nums[i];

        }

        System.out.println("Low: "+low + "; High: "+high);

        while(low<=high){
            int largest = low+(high-low)/2;

            int noOfSubArrays=0;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>largest){
                    noOfSubArrays++;
                    sum=nums[i];
                    if(sum>largest) noOfSubArrays++;
                }
                if(i==nums.length-1)noOfSubArrays++; 
            }
            System.out.println("Low: "+ low+ "; High: "+high);
            System.out.println("No of Subarrays: "+ noOfSubArrays + " Largest: "+largest);

            if(noOfSubArrays>k){
                low=largest+1;
            }else{
                high=largest-1;
            }

        }
        
        return high+1;            
    }
}