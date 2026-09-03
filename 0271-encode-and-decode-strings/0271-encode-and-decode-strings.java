public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) { 
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }       
        return sb.toString();
    }


    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        int j=0;
        int i=0;
        List<String> list = new ArrayList<>();
        while(j<s.length()){
            if(s.charAt(j)=='#'){
                int length=0;
                while(i<j){
                    length=length*10+ s.charAt(i)-'0';
                    i++;        
                }
                if(length==0)list.add("");
                else list.add(s.substring(j+1,j+length+1));
                j=j+length+1;
                i=j;
            }else j++;
        }

        return list;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));