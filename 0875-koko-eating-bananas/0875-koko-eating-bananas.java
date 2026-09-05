class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile: piles)
            if(pile>high) high=pile;

        int ans=0;
        while(low<=high){
            int mid = (high-low)/2 + low;
            long hours = 0;
            for(int i=0;i<piles.length;i++){
                hours+=piles[i]/mid;
                if(piles[i]%mid!=0) hours++;
            }
            if(hours<=h){
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}