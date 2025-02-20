class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int largest=piles[0];
        long sum=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>largest) largest=piles[i];
            sum+=piles[i];
        }

        if(h==piles.length) return largest;
        if(h>=sum) {
            // System.out.println("H>sum "+sum);
            return 1;
        }

        int low =2, high = largest;
        int ans=-1;
        int smallest=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=Math.ceil((double)piles[i]/mid);
                // System.out.println("Sum: "+sum+ ", mid: "+mid);
            }
            // System.out.println("Sum: "+sum);

            if(sum<=h){
                // System.out.println("Sum: "+sum+ ", mid: "+mid);
                ans=mid;
                high=mid-1;
            }else if(sum>h){
                low=mid+1;
            }

        }

        return ans;

    }
}