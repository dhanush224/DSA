class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] ans = {-1,-1};

        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                // System.out.println("i:"+numbers[i]+", j:"+numbers[j]);
                if((target-numbers[i])==numbers[j]){
                    ans[0] = i+1;
                    ans[1] = j+1;
                    return ans;
                }else if(numbers[j]>target-numbers[i]){
                    break;
                }

                
            }
        }

        return ans;
        
    }
}