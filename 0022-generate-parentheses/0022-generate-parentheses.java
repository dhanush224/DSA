class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        StringBuilder sb = new StringBuilder();
        return recursion(n, sb, 0, 0, 0);

    }

    public List<String> recursion(int n, StringBuilder sb, int positivity, int i, int left){
        
        if(i==2*n){
            list.add(sb.toString());
            return list;
        }

        if(positivity==0){
            sb.append('(');
            recursion(n,sb,positivity+1,i+1,left+1);
            sb.deleteCharAt(i);
        }else{
            if(left<n){
                sb.append('(');
                recursion(n,sb,positivity+1,i+1,left+1);
                sb.deleteCharAt(i);
                sb.append(')');
                recursion(n,sb,positivity-1,i+1,left);
                sb.deleteCharAt(i);
            }else{
                sb.append(')');
                recursion(n,sb,positivity-1,i+1,left);
                sb.deleteCharAt(i);
            }
        }

        return list;
    }

}