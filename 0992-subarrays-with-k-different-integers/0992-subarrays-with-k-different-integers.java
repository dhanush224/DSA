class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        int i=0,j=0;
        int n = nums.length;
        int total=0;
        for(j=0;j<n;j++){
            if(map.containsKey(nums[j])) map.put(nums[j],map.get(nums[j])+1);
            else map.put(nums[j],1);
            while(map.size()>k){
                if(map.get(nums[i])==1) map.remove(nums[i]);
                else map.put(nums[i], map.get(nums[i])-1);
                i++;
            }
            
            total+=j-i+1;
        }
        map.clear();
        j=0;i=0;

        for(j=0;j<n;j++){
            if(map.containsKey(nums[j])) map.put(nums[j],map.get(nums[j])+1);
            else map.put(nums[j],1);
            while(map.size()>k-1){
                if(map.get(nums[i])==1) map.remove(nums[i]);
                else map.put(nums[i], map.get(nums[i])-1);
                i++;
            }
            total-=j-i+1;
        }
        return total;
    }
}