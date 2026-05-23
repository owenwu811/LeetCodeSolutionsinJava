//159
//Medium

//Given a string s, return the length of the longest substring that contains at most two distinct characters.


//Example 1:

//Input: s = "eceba"
//Output: 3
//Explanation: The substring is "ece" which its length is 3.

// my own solution using java:

// just brute force it with smart cut off

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> hs = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                hs.add(s.charAt(j));
                if (hs.size() <= 2) {
                    ans = Math.max(ans, j - i + 1);
                }
                else {
                    break;
                }

            }
        }
        return ans;
}
}
