class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> map = new HashSet<>();

        if(nums.length==0) return 0;

        for(int i=0;i<nums.length;i++){
            map.add(Integer.valueOf(nums[i]));
        }

        int maxLength=1;
        for(int num: map){            
            if(!map.contains(num-1)){
                int length=1;
                while(map.contains(num+length)){
                    length++;
                }
                if(length>maxLength) maxLength = length;          
            }
        } 

        return maxLength;       
    }
}