class Solution {
    public void sortColors(int[] nums) {

        int zeroes =0, ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroes++;
            else if(nums[i]==1) ones++;
        }

        for(int i=0;i<nums.length;i++){
            if(zeroes!=0){
                nums[i]=0;
                zeroes--;
            } 
            else if(ones!=0){
                nums[i]=1;
                ones--;
            }
            else nums[i]=2;
        }


    }
}