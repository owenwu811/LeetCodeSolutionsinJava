//3884
//Easy

//You are given a string s of length n consisting of lowercase English letters.

//Return the smallest index i such that s[i] == s[n - i - 1].

//If no such index exists, return -1.

// my own solution using java:

// just use two pointer

class Solution {
    public int firstMatchingIndex(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] ss = s.toCharArray();
        while (l <= r) {
            if (ss[l] == ss[r]) {
                return l;
            }
            l++;
            r--;

        }
        return -1;
    }
}
