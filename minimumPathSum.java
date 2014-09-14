public class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] result = new int[row][col];
        result[0][0] = grid[0][0];
        for(int m = 1; m < row;m++){
            result[m][0] = result[m-1][0] + grid[m][0];
        }
        for(int n = 1; n < col;n++){
            result[0][n] = result[0][n-1] + grid[0][n];
        }
        for (int i = 1; i < row;i++){
            for (int j = 1 ; j < col;j++){
                result[i][j] = Math.min(result[i-1][j], result[i][j-1]) + grid[i][j];
            }
        }
        return result[row-1][col-1];
    }
}