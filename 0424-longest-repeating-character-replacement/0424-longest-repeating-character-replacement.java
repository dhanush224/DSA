class Solution {
    public int characterReplacement(String s, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        int maxLength=0;
        int maxFreq=0;

        int i =0;
        int n = s.length();
        for(int j=0;j<n;j++){
            if(j==n-1 && (j-i+1)<maxLength)break;

            int key = (int)s.charAt(j);
            if(!map.containsKey(key)) map.put(key,1);
            else map.put(key,map.get(key)+1);

            maxFreq=Math.max(maxFreq,map.get(key));

            while((j-i+1)-maxFreq>k){
                int updateKey = (int)s.charAt(i);
                map.put(updateKey,map.get(updateKey)-1);
                i++;
            }
            maxLength=Math.max(j-i+1,maxLength);
            
        }

        return maxLength;
    }

}