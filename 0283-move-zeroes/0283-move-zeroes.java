class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int index=-1;
                index = findNextNonZeroIndex(i+1,nums);
                if(index!=-1){
                    nums[i]=nums[index];
                    nums[index]=0;
                }else{
                    break;
                }
            }
            zeroCount--;
        }        

    
        
    }

    public int findNextNonZeroIndex(int i, int[] nums){
        for(int j=i;j<nums.length;j++){
            if(nums[j]!=0){
                return j;
            
            }
        }
        return -1;
    }
}