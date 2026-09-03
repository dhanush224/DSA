class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int prod=1;
        for(int i=0;i<n;i++){
            prefix[i]=prod*nums[i];
            prod=prefix[i];
        }
        prod=1;

        for(int i=n-1;i>=0;i--){
            int x = 1;
            int y = 1;
            if(i-1>=0) x=prefix[i-1];
            y=prod;
            prod*=nums[i];
            prefix[i]=x*y;
        }

        return prefix;
    }
}