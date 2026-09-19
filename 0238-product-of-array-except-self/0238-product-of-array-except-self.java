class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prod = new int[nums.length];

        int product=1;
        for(int i=0;i<nums.length;i++){
            prod[i]=nums[i]*product;
            product = prod[i];
        }

        product=1;

        int left = 1;
        for(int i=nums.length-1;i>=0;i--){
            if(i>0) left= prod[i-1];
            else left=1;

            prod[i]=left*product;
            product=nums[i]*product;
        }
        return prod;
    }
}