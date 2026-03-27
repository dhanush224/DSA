class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;
        int i=0;
        int j =n-k;
        int sum=0,maxSum=0;
        

        while(j<n){
            sum+=cardPoints[j];
            j++;
        }
        maxSum=sum;

        // if(k==n) return maxSum;

        j=n-k;
        while(i<k){
            sum+=cardPoints[i];
            sum-=cardPoints[j];
            maxSum=Math.max(sum,maxSum);
            i++;
            j++;
        }

        return maxSum;        
    }
}