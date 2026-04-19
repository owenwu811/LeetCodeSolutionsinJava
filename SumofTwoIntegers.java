//371
//Medium

//Given two integers a and b, return the sum of the two integers without using the operators + and -.

// correct java solution:

class Solution {
    public int getSum(int a, int b) {
        int[] cur = {a, b};
        int sum = Arrays.stream(cur).sum();
        return sum;
    }
}
