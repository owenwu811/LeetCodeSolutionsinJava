//308
//Medium

//Given a 2D matrix matrix, handle multiple queries of the following types:

//Update the value of a cell in matrix.
//Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
//Implement the NumMatrix class:

//NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
//void update(int row, int col, int val) Updates the value of matrix[row][col] to be val.
//int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

// my own solution using java:

// just brute force it

class NumMatrix {

    int[][] m;
    public NumMatrix(int[][] matrix) {
        this.m = matrix.clone();
        
    }
    
    public void update(int row, int col, int val) {
        this.m[row][col] = val;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        for (int l = row1; l < row2 + 1; l++) {
            for (int r = col1; r < col2 + 1; r++) {
                ans += this.m[l][r];

            }
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * obj.update(row,col,val);
 * int param_2 = obj.sumRegion(row1,col1,row2,col2);
 */
