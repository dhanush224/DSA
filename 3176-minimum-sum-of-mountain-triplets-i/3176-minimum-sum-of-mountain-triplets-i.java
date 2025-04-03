class Solution {
    public int minimumSum(int[] nums) {

        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]<nums[j] && nums[j]>nums[k]){
                        int val = nums[i]+nums[j]+nums[k];
                        if(val<minValue) minValue = val;

                        System.out.println("i:"+i+", j:"+j+", k:"+k+ "; Value:"+val);
                    }
                }
            }
        }

        if(minValue==Integer.MAX_VALUE) return -1;
        return minValue;
        
    }
}