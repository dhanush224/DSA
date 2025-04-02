class Solution {
    public long maximumTripletValue(int[] nums) {


        if(nums.length<3) return -1;
        long maxValue=0;

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    long value = (nums[i]-nums[j]);
                    // System.out.println("Value: "+value);
                    // System.out.println("nums[k]: "+nums[k]);
                    value*=nums[k];
                    // System.out.println("i:"+i+" j:"+j+" k:"+k);
                    // System.out.println("Value: "+value);
                    if(value>maxValue) maxValue = value;
                }
            }

        }

        return maxValue;
        
    }
}