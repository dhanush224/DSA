class Solution {
    public int findKthPositive(int[] arr, int k) {

        for(int i=0;i<arr.length;i++){
            // System.out.println("Val: "+(arr[i-1]-i));
            if((arr[i]-(i+1))>=k){
                return (i+k);
            }
        } 

        // if(arr[arr.length-1]==arr.length) return arr[arr.length-1]+k;
        
        return arr.length+k;       


    }
}