
//9
//Easy

//Given an integer x, return true if x is a palindrome, and false otherwise.


//Example 1:

//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.


// my own solution using java:

// turn into string and compare forward to reverse

class Solution {
    public boolean isPalindrome(int x) {
        String now = String.valueOf(x);
        String reversed = new StringBuilder(now).reverse().toString();
        return now.equals(reversed);




    }
}
