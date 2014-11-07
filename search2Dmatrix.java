public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int first = 0;
       int row = matrix.length;
       int col = matrix[0].length;
       int last = row*col-1;
       while(first <= last){
           int mid = (first + last)/2;
           int m = mid/col;
           int n = mid%col;
           if (matrix[m][n] == target){
               return true;
           }else if(matrix[m][n] < target){
                first = mid+1;
           }else{
                last = mid-1;
           }
       }
       return false;
    }
}