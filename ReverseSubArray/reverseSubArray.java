
// User function Template for Java

class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) {
        // code here
        int j=1;
        int swaps = (r-l+1)/2;
        while(swaps!=0){
            int temp = arr.get(l-2+j);
            arr.set(l-2+j, arr.get(r-j));
            arr.set(r-j, temp);
            j++;
            swaps--;
        }
        
        return arr;
    }
}
