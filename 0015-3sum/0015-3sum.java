class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);      
        
        List<List<Integer>> ans = new ArrayList<>();

        int prevI=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]!=prevI){
                // System.out.println("PrevI: "+prevI);
                int j=i+1,k=nums.length-1;
                int prevJ=Integer.MIN_VALUE, prevK=Integer.MIN_VALUE;
                while(j<k){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        prevI = nums[i];
                        prevJ = nums[j];
                        prevK = nums[k];
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
                    while(nums[j]==prevJ){
                        j++;
                        if(j==nums.length) break;
                    } 
                    while(nums[k]==prevK){
                        k--;
                        if(k==0) break;
                    }
                }
            }
        }




        return ans;
        


        
    }
}