class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> count = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(count.get(s.charAt(i))!=null){
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }else count.put(s.charAt(i),1);
        }

        Map<Integer,ArrayList<Character>> reversecount = new HashMap<>();
        for(Character c: count.keySet()){
            if(reversecount.get(count.get(c))!=null){
                Integer i = count.get(c);
                ArrayList<Character> list = reversecount.get(i);
                list.add(c);
                reversecount.put( i , list);
            }else{
                ArrayList<Character> list = new ArrayList<>();
                list.add(c);
                reversecount.put(count.get(c),list);
            } 
        }

        String t="";
        for(int i=s.length();i>0;i--){
            if(reversecount.containsKey(i)){
                for(int j=0;j<reversecount.get(i).size();j++){
                    for(int k=0;k<i;k++){
                        t+=reversecount.get(i).get(j);
                    }                    
                }
            }
        }

        return t;

                
    }
}