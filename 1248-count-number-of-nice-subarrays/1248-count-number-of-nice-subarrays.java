class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int odds=0;
        int total=0;

        int i=0,m=0,j=0;
        int n = nums.length;

        for(j=0;j<n;j++){
            if(nums[j]%2!=0)odds++;
            while(odds>k){
                if(nums[i]%2!=0)odds--;
                i++;
            }
            if(odds==k){
                m=i;
                while(nums[m]%2==0)m++;
                total+=m-i+1;
            }
        }
        
        return total;
        
    }
}