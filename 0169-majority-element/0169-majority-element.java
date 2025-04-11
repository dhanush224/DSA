class Solution {
    public int majorityElement(int[] nums) {

        int first = nums[0];
        int firstFreq = 1;
        int sec = nums[0];
        int secFreq = 1;
        


        for(int i=1;i<nums.length;i++){
            // System.out.println("first: "+first+", second: "+sec);
            if(nums[i]==first){
                firstFreq++;
            }else if(nums[i]==sec){
                secFreq++;
            }else{
                sec = nums[i];
            }
            // System.out.println("first freq: "+firstFreq+", second freq: "+secFreq);


            if(secFreq>firstFreq){
                int temp = secFreq;
                secFreq = firstFreq;
                firstFreq = temp;
                temp = sec;
                sec = first;
                first = temp;
            }
            // System.out.println("After swap: "+"first freq: "+first+", second freq: "+sec);

            

        }

        return first;


        
    }
}