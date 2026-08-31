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
        List<String> ret = new ArrayList<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                int length=s.charAt(j)-'0';
                int l = i-j-1;
                for(int z=0;z<l;z++){
                    length*=10;
                    j++;
                    length+=s.charAt(j)-'0';
                }
                if(length==0){
                    ret.add("");
                    j=i+1;
                    continue;
                }
                ret.add(s.substring(i+1,i+length+1));
                i=i+length;
                j=i+1;                
            }
        }
        return ret;     
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));