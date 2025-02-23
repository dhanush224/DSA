class Solution {
    public int findKthPositive(int[] arr, int k) {

        if(arr[arr.length-1]==arr.length) return arr[arr.length-1]+k;

        int low=0, high = arr.length-1;
        int mid = low+(high-low)/2;
        int index=-1;
        while(low<=high){
            mid = low+(high-low)/2;
            int val = arr[mid]-mid-1;

            if(val==0){
                low=mid+1;
            }else if(val>=k){
                index=mid;
                high=mid-1;                
            }else{
                low=mid+1;
            }
        }
        if(index==-1){
            index=arr.length;
        } 
        System.out.println("Index: "+index);
        return index+k;

        
        


    }
}