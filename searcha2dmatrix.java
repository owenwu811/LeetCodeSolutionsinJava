//74
//medium

//You are given an m x n integer matrix matrix with the following two properties:

//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.

//You must write a solution in O(log(m * n)) time complexity.


// my own solution using java:

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

// my own optimized solution using java:

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int l = 0;
            int r = row.length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                }
                else if (matrix[i][mid] > target) {
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }
        return false;
    }
}
