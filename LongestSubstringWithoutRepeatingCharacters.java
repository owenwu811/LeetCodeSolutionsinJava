//3
//Medium

//Given a string s, find the length of the longest substring without duplicate characters.


//Example 1:

//Input: s = "abcabcbb"
//Output: 3

// my own solution using java:

//just keep shrinking window by popping left most until current character we are processing is not in list, and then add it, and take size

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        ArrayList<Character> hs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            while (hs.contains(s.charAt(i))) {
                hs.remove(0);
            }
            hs.add(s.charAt(i));
            System.out.println(hs);
            ans = Math.max(ans, hs.size());

        }
        return ans;
    }
}
