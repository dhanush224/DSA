class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);      
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
                // System.out.println("PrevI: "+prevI);
                int j=i+1,k=nums.length-1;
                while(j<k){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        // System.out.println("nums[i]:"+nums[i]+", i:"+i);
                        // System.out.println("nums[j]:"+nums[j]+", j:"+j);
                        // System.out.println("nums[k]:"+nums[k]+", k:"+k);
                        // System.out.println("PrevJ: "+prevJ);
                        // System.out.println("PrevK: "+prevK);        

                        j++;
                        k--;
                        ans.add(list);


                    }else if(sum<0){
                        j++;
                    }
                    else{
                        k--;
                    }

                    while(j<k && j-1!=i && nums[j]==nums[j-1]){
                        j++;
                        // System.out.println("j:"+j+", k:"+k);
                    } 
                    while(j<k && k!=nums.length-1 && nums[k]==nums[k+1]){
                        k--;
                        // System.out.println("j:"+j+", k:"+k);
                    } 

                }
            
        }




        return ans;
        


        
    }
}