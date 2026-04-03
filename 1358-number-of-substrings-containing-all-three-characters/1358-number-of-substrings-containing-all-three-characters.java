class Solution {
    public int numberOfSubstrings(String s) {

        int n  = s.length();
        int total =0;
        int i=0;
        int[] arr = {0,0,0};

        for(int j=0;j<n;j++){
            arr[(int)s.charAt(j)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                total+=1+(n-1-j);
                arr[(int)s.charAt(i)-'a']--;
                i++;                
            }            
        }

        return total;        
    }


}