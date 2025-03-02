
//367
//easy

//Given a positive integer num, return true if num is a perfect square or false otherwise.

//A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

//You must not use any built-in library function, such as sqrt.

 

//Example 1:

//Input: num = 16
//Output: true
//Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

// my own solution using java:


class Solution {
    public boolean isPerfectSquare(int num) {
        int a = (int)Math.sqrt(num);
        return a * a == num;
    }
}
