class Solution {
    public int numberOfSubstrings(String s) {

        int n  = s.length();
        int total =0;
        int i=0;
        int[] arr = {0,0,0};

        for(int j=0;j<n;j++){
            int c = (int)s.charAt(j)-(int)('a');
            arr[c]++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                int ci = (int)s.charAt(i)-(int)('a');
                total+=1+(n-1-j);
                arr[ci]--;
                i++;                
            }            
        }

        return total;        
    }


}