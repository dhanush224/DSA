class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int length=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==1){
                length++;
            }else length=0;
            // System.out.println("Length: "+length);

            if(length>maxOnes) maxOnes = length;
        }

        return maxOnes;
        
    }
}