package leetcode;

public class PathSum64 {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println(sumPath(grid, 0, 0));
    }
    static int sumPath(int[][] grid , int row, int col){
        // Base case for return
        if(row == grid.length-1 && col == grid[0].length-1){
            return grid[row][col];
        }

        // reach to end of row we can only move right
        if (row == grid.length - 1) {
            return grid[row][col] + sumPath(grid, row, col + 1);
        }

        // reach end of col we can only move down
        if (col == grid[0].length - 1) {
            return grid[row][col] + sumPath(grid, row + 1, col);
        }

        // recursion call
        int down = sumPath(grid, row + 1, col);
        int right = sumPath(grid, row, col + 1);

        return grid[row][col] + Math.min(down, right);
    }
}
