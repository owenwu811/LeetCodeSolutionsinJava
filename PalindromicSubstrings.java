//647
//Medium

//Given a string s, return the number of palindromic substrings in it.

//A string is a palindrome when it reads the same backward as forward.

//A substring is a contiguous sequence of characters within the string.

 

//Example 1:

//Input: s = "abc"
//Output: 3

// my own solution using java:

// brute force compare every substring with its reverse

class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            String ss = "";
            for (int j = i; j < s.length(); j++) {
                ss += s.charAt(j);
                var cur = new StringBuilder(ss).reverse().toString();
                if (ss.equals(cur)) {
                    ans++;
                }

            }
        }
        return ans;
    }
}
