class Solution {
    public void setZeroes(int[][] matrix) {
        
        ArrayList<Integer> listI = new ArrayList<>();
        ArrayList<Integer> listJ = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(!listI.contains(i)) listI.add(i);
                    if(!listJ.contains(j)) listJ.add(j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(listI.contains(i) || listJ.contains(j)) matrix[i][j]=0; 

            }
        }
        
    }
}