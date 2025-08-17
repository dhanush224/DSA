class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        // for(int i=0;i<words.length;i++){
        //     System.out.println("i: "+i+" "+words[i]);
        // }

        for(int i=words.length-1;i>=0;i--){
            // System.out.println("i: "+i);
            if(words[i].length()==0 ) continue;
            else{
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        

        return sb.toString().trim();

        
    }
}