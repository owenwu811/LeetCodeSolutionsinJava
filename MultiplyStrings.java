//43
//Medium

//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

//Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.


//Example 1:

//Input: num1 = "2", num2 = "3"
//Output: "6"

// my own solution using java:

// just convert from BigInteger to String 

import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger one = new BigInteger(num1);
        BigInteger two = new BigInteger(num2);
        BigInteger three = one.multiply(two);
        return String.valueOf(three);
    }
}
