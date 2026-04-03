class Solution {
    public int numberOfSubstrings(String s) {

        int n  = s.length();
        int total =0;
        int i=0;
        Map<Character, Integer> map = new HashMap<>();
        for(i=0;i<3;i++){
            Character c = s.charAt(i);
            if(!map.containsKey(c))map.put(c,1);
            else map.put(c,map.get(c)+1);
        }  

        i=0;

        for(int j=i+2;j<n;j++){
            Character c = s.charAt(j);
            
            if(j>2){
                if(!map.containsKey(c))map.put(c,1);
                else map.put(c,map.get(c)+1);
            }
            while(map.size()==3){
                Character ci = s.charAt(i);
                total+=1+(n-1-j);
                if(map.get(ci)==1) map.remove(ci);
                else map.put(ci,map.get(ci)-1);
                i++;                
            }

            
        }

        return total;        
    }


}