class Solution {
    public int characterReplacement(String s, int k) {


        Map<Integer,Integer> map = new HashMap<>();
        int maxLength=0;

        int i =0;
        int n = s.length();
        for(int j=0;j<n;j++){
            int key = (int)s.charAt(j);
            if(!map.containsKey(key)) map.put(key,1);
            else map.put(key,map.get(key)+1);

            int length = j-i+1;
            while(length-maxCount(map)>k &&i<n){
                int updateKey = (int)s.charAt(i);
                map.put(updateKey,map.get(updateKey)-1);
                i++;
                length=j-i+1;
                if(j==n-1 && length<maxLength)break;
            }
            if(i==n)break;
            maxLength=Math.max(length,maxLength);
            
        }

        return maxLength;
    }

    public int maxCount(Map<Integer,Integer> map){
        int max=0;
        for(Integer val: map.values()){
            max=Math.max(val,max);
        }
        return max;
    }

}