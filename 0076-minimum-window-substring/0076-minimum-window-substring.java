class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        
        Map<Character, Integer> mapT = new HashMap<>();
        Map<Character, Integer> mapS = new HashMap<>();

        for(char c: t.toCharArray()) mapT.put(c, mapT.getOrDefault(c,0)+1);
        int need = mapT.size();
        int have = 0;
        int minLength=s.length()+1;
        int resI=-1;
        int resJ=-1;

        int n = s.length();
        int i=0;
        for(int j=0;j<n;j++){
            char c = s.charAt(j);
            if(mapT.containsKey(c)){
                mapS.put(c, mapS.getOrDefault(c,0)+1);
                if(mapS.get(c).equals(mapT.get(c))) have++;
            }
            while(have==need){
                if(j-i+1<minLength){
                    minLength=j-i+1;
                    resI=i;
                    resJ=j;
                }
                if(mapT.containsKey(s.charAt(i))){
                    mapS.put(s.charAt(i), mapS.get(s.charAt(i))-1);
                    if(mapS.get(s.charAt(i))<mapT.get(s.charAt(i))) have--;
                }
                i++;
            }
        }
        if(resI>=0 && resJ>=0) return s.substring(resI,resJ+1);
        else return "";
    }
}