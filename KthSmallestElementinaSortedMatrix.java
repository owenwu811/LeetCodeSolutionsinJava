//378
//Medium

//Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.

//Note that it is the kth smallest element in the sorted order, not the kth distinct element.

//You must find a solution with a memory complexity better than O(n2).

// my own solution using java:

// just get all the element by flattening, and then sort, and then return kth

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> cur = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                cur.add(matrix[i][j]);
            }
        }
        Collections.sort(cur);
        return cur.get(k - 1);
    }
}
