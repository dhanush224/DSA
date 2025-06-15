class Solution {
    public void sortColors(int[] nums) {

        int l = 0, r=nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(i>r) break;
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l++;
            }else if(nums[i]==2){
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
                i--;
            }
            // System.out.println("i: "+(i+1)+", l:"+l+", r:"+r);
            
        }

    }
}