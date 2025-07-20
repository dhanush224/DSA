class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> count = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(count.get(s.charAt(i))!=null){
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }else count.put(s.charAt(i),1);
        }

        List<Character> list = new ArrayList<>(count.keySet());

        list.sort((a,b) -> count.get(b)-count.get(a));

        String t="";
        for(Character ch: list){
            for(int j=0;j<count.get(ch);j++){
                t+=ch;
            }
        }


        return t;

                
    }
}