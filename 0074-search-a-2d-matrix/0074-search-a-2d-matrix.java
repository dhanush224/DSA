class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int low = 0;
        int high = matrix.length-2;
        int row=matrix.length-1;

        while(low<=high){
            int mid = (high-low)/2 + low;
            if(matrix[mid][0]==target)return true;
            else if(matrix[mid][0]<target && target<matrix[mid+1][0]){
                row=mid;
                break;
            }else if(matrix[mid][0]<target){
                low=mid+1;
            }else if(target<matrix[mid][0]){
                high=mid-1;
            }
        }

        low=0;
        high=matrix[0].length-1;
        while(low<=high){
            int mid = (high-low)/2 + low;
            if(matrix[row][mid]==target)return true;
            else if(matrix[row][mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return false;

    }
}