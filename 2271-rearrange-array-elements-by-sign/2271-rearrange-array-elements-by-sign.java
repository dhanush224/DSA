class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];
        int pos=0, neg=0;
        if(nums[0]>0)pos=0;
        else neg=0;  
        for(int i=0;i<ans.length;i++){
            if(i%2==0){
                if(pos<nums.length && nums[pos]>0){
                    ans[i]=nums[pos];
                    pos++;
                }else{
                    pos++;
                    i--;
                }
            }else{
                if(neg<nums.length && nums[neg]<0){
                    ans[i]=nums[neg];
                    neg++;
                }else{
                    neg++;
                    i--;
                }

            }
            
        }
        return ans;
    }
}