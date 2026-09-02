class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,HashSet<Integer>> rowSet = new HashMap<>();
        Map<Integer,HashSet<Integer>> colSet = new HashMap<>();
        Map<String,HashSet<Integer>> boxes = new HashMap<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                String s = (char)i/3 +","+ (char)j/3;
                Integer val = (int)board[i][j];
                if(rowSet.computeIfAbsent(i,k ->new HashSet<>()).contains(val) || colSet.computeIfAbsent(j,k ->new HashSet<>()).contains(val) || boxes.computeIfAbsent(s,k ->new HashSet<>()).contains(val)) return false;

                if(board[i][j]!='.'){
                    rowSet.get(i).add((int)board[i][j]);
                    colSet.get(j).add((int)board[i][j]);
                    boxes.get(s).add((int)board[i][j]);
                }
                

            }
        }        

        return true;        
    }
}