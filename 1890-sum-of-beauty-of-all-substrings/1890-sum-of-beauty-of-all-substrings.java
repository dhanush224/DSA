class Solution {
    public int beautySum(String s) {
        int sum=0;

        for(int i=0;i<s.length()-2;i++){
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++){
                int letter = s.charAt(j)-'a';
                freq[letter] = freq[letter]+1;
                int beauty = getMaxCount(freq) - getMinCount(freq);
                sum+=beauty;
            }
        }

        return sum;        
    }

    public int getMaxCount(int[] freq){
        int max=0;
        for(int i=0;i<freq.length;i++){
            max=Math.max(max,freq[i]);
        }

        return max;
    }

    public int getMinCount(int[] freq){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                min=Math.min(min,freq[i]);
            }
        }

        return min;
    }
}