class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int noOfLoops = arr.size()/k;
        int i = 0;
        int j = k-1;
        int m = i;
        if(j>arr.size()-1){
            j=arr.size()-1;
            while(i<j){
                Long temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j,temp);
                i++;
                j--;
            }
        }else{
            while(!(i>(arr.size()-1))){
                while(i<j){
                    Long temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j,temp);
                    i++;
                    j--;
                }
                i=m+k;
                j=i+k-1;
                m=i;
                
                if(j>arr.size()-1){
                    j=arr.size()-1;
                }
            }
        }
    }
}
