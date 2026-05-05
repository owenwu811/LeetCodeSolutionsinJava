//5
//Medium

//Given a string s, return the longest palindromic substring in s.

 

//Example 1:

//Input: s = "babad"
//Output: "bab"

// correct java solution (could not solve):

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String best = "";
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                sb.append(s.charAt(j));
                String current = sb.toString();
                if (isPalindrome(current)) {
                    if (current.length() > best.length()) {
                        best = current;
                    }
                }
            }
        }
        return best;
    }
    public static boolean isPalindrome(String current) {
        int l = 0;
        int r = current.length() - 1;
        while (l < r) {
            if (current.charAt(l) != current.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
