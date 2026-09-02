class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,HashSet<Character>> rowSet = new HashMap<>();
        Map<Integer,HashSet<Character>> colSet = new HashMap<>();
        Map<String,HashSet<Character>> boxes = new HashMap<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                String s = (char)i/3 +","+ (char)j/3;
                char val = board[i][j];
                if( (rowSet.get(i)!=null && rowSet.get(i).contains(val)) || (colSet.get(j)!=null && colSet.get(j).contains(val)) || (boxes.get(s)!=null && boxes.get(s).contains(val)) ) return false;

                if(rowSet.get(i)==null) rowSet.put(i,new HashSet<>());
                colSet.putIfAbsent(j, new HashSet<>());
                boxes.putIfAbsent(s, new HashSet<>());
                rowSet.get(i).add(val);
                colSet.get(j).add(val);
                boxes.get(s).add(val);
                
            }
        }        

        return true;        
    }
}