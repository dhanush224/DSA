class Solution {
    public void sortColors(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(map.containsKey(0)) {
                    int val= map.get(0);
                    map.put(0, val+1);
                }
                else map.put(0,1);
            }else if(nums[i]==1){
                if(map.containsKey(1)) {
                    int val= map.get(1);
                    map.put(1, val+1);
                }
                else map.put(1,1);

            }else{
                if(map.containsKey(2)) {
                    int val= map.get(2);
                    map.put(2, val+1);
                }
                else map.put(2,1);
            }          
        }

        // System.out.println("Map 0: "+ map.get(0)+" Map 1: "+ map.get(1)+ " Map 2: "+map.get(2));

        int j=0;
        if(map.containsKey(0)){
            for(int i=0;i<map.get(0);i++){
            nums[j]=0;
            j++;
        }
        }
        if(map.containsKey(1)){
            for(int i=0;i<map.get(1);i++){
            nums[j]=1;
            j++;
        }
        }
        if(map.containsKey(2)){
            for(int i=0;i<map.get(2);i++){
            nums[j]=2;
            j++;
        }
        }
    }

}