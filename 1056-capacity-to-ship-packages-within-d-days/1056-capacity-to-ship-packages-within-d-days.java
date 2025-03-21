class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int largest = weights[0];
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(weights[i]>largest){
                largest = weights[i];
            }
        }

        int low=largest, high=sum;

        while(low<=high){
            int mid=low+(high-low)/2;
            int capacity=mid;
            int daysCount=1;
            System.out.println("Capacity: "+ capacity);
            for(int i=0;i<weights.length;i++){
                if(capacity>=weights[i]){
                    capacity-=weights[i];
                }else{
                    daysCount++;
                    capacity=mid;
                    capacity-=weights[i];
                }

                
            }
            System.out.println("Days Count: "+ daysCount);
            if(daysCount<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return low;       
        
    }
}