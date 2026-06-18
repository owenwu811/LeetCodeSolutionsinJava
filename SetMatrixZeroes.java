
//73
//Medium

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

//You must do it in place.

// my own solution using java:

//just populate the matrix if its a 0 - loop through its corresponding row and column and set every cell to 0

class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> zeros = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeros.add(List.of(i, j));
                }
            }

        }
        for (List<Integer> cur: zeros) {
            int x = cur.get(0);
            int y = cur.get(1);
            for (int i = 0; i < n; i++) {
                //System.out.println(x + " " + i);
                matrix[x][i] = 0;
            }
            for (int j = 0; j < m; j++) {
                //if y < m && j < n
                //System.out.println(y + " " + j);
                matrix[j][y] = 0;
                
                //matrix[j][y] = 0;
            }
            

        }
        
    }
}
