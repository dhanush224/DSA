class Solution {
    public int maxDepth(String s) {

        int maxDepth=0;
        int depth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
                if(depth>maxDepth) maxDepth=depth;
            }else if(s.charAt(i)==')'){
                depth--;
            }
        }

        return maxDepth;
        
    }
}