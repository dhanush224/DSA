class Solution {
    public void sortColors(int[] nums) {

        int red=0, white=0, blue=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) red++;
            if(nums[i]==1) white++;
            if(nums[i]==2) blue++;
        }

        System.out.println("Red: "+red+ " White: "+white+" Blue: "+blue);

        for(int i=0;i<nums.length;i++){
            if(red!=0){
                nums[i]=0;
                red--;
            }else {
                if(white!=0){
                    nums[i]=1;
                    white--;
                }else nums[i]=2;
            }
        }

        
        
    }
}