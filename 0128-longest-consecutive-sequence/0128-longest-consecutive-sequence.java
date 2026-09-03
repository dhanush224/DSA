class Solution {
    public int longestConsecutive(int[] nums) { 
        if(nums.length==0) return 0;
        Set<Integer> hs = new HashSet<>();

        for(int n: nums){
            if(!hs.contains(n)) hs.add(n);
        }
        int maxLength=1;
        for(int n: hs){
            if(!hs.contains(n-1)){
                int length=1;
                while(hs.contains(n+length)){
                    length++;
                }
                if(length>maxLength)maxLength = length;
            }
        }

        return maxLength;
    }
}