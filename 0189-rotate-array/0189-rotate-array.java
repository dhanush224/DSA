class Solution {
    public void rotate(int[] nums, int k) {
//----------------------SOLUTION2-----------------------------
        k=k%nums.length;
        int[] nums2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums2[(i+k)%nums.length] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums2[i];
        }

//----------------------SOLUTION1-----------------------------
        // k=k%nums.length;
        // for(int j=0;j<k;j++){
        //     if(k==nums.length) break;
        //     int next=nums[0];
        //     for(int i=0;i<nums.length;i++){
        //     int temp = nums[(i+1)%nums.length];
        //     nums[(i+1)%nums.length] = next;
        //     next = temp;
        //     }

        // }


    }
}