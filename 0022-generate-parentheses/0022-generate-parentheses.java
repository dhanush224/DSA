class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        recursion(n, list, sb, 0,0);

        return list;
    }

    public void recursion(int n, List<String> list, StringBuilder sb, int openN, int closedN) {

        if(openN==closedN && closedN==n){
            list.add(sb.toString());
            return;
        }


        if(openN==n && closedN<n){
            sb.append(')');
            recursion(n,list,sb,openN,closedN+1);
            sb.deleteCharAt(sb.length()-1);
        }

        if(openN>=closedN && openN<n){
            sb.append('(');
            recursion(n,list,sb,openN+1,closedN);
            sb.deleteCharAt(sb.length()-1);
            if(openN>closedN){
                sb.append(')');
                recursion(n,list,sb,openN,closedN+1);
                sb.deleteCharAt(sb.length()-1);
            }

        }

    }
}