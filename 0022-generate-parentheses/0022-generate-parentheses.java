class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        recursion(list, new StringBuilder(), n, 0,0);

        return list;
    }

    public void recursion(List<String> list, StringBuilder sb, int n, int open, int close){
        if(close==n){
            list.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append('(');
            recursion(list, sb,n,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open){
            sb.append(')');
            recursion(list,sb,n,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }

}