class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]) {
                index=i;
                break;
            }
        }
        // System.out.println("Index:"+index);
        if(index==-1)Arrays.sort(nums);
        else{
             
            for(int i=nums.length-1;i>index;i--){
                if(nums[i]>nums[index]){
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }

            // System.out.println("After swap:");
            // for(int i=0;i<nums.length;i++){
            //     System.out.print(nums[i]+" ");
            // }

            int j=0;
            for(int i=index+1;i<(nums.length-index-1)/2+index+1;i++){
                int temp = nums[i];
                nums[i] = nums[nums.length-1-j];
                nums[nums.length-1-j] = temp;
                j++;                
            }
        }

                
    }
}