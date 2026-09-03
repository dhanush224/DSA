class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int prod=1;
        for(int i=0;i<n;i++){
            prefix[i]=prod*nums[i];
            prod=prefix[i];
        }
        prod=1;
        for(int i=n-1;i>=0;i--){
            suffix[i]=prod*nums[i];
            prod=suffix[i];
        }
        int[] ret = new int[n];
        for(int i=0;i<n;i++){
            int x = 1;
            int y = 1;
            if(i-1>=0) x=prefix[i-1];
            if(i+1<n) y=suffix[i+1];
            ret[i]=x*y;
        }

        return ret;
    }
}