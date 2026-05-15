//200
//Medium

//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

// my own solution using java:

//follow dfs to not revisit islands, and make sure to be careful of casting between char and string

class Solution {
    public static void dfs(int i, int j, char[][] grid) { 
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || String.valueOf(grid[i][j]).equals("0")) {
            return;
        }
        grid[i][j] = "0".toCharArray()[0];
        dfs(i + 1, j, grid);
        dfs(i - 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);
    }
    public int numIslands(char[][] grid) {
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (String.valueOf(grid[i][j]).equals("1")) {
                res++;
                dfs(i, j, grid);
            }
            }
        }
        return res;
        
    }
}
