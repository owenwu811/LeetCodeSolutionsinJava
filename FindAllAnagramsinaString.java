//438
//Medium

//Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 

//Example 1:

//Input: s = "cbaebabacd", p = "abc"
//Output: [0,6]
//Explanation:
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".

// my own solution using java:

// just sliding window fixed size - compare each array in sorted order of size p

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] ss = s.toCharArray();
        char[] ppsorted = p.toCharArray();
        Arrays.sort(ppsorted);
        int size = p.length();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < ss.length - size + 1; i++) {
            char[] cur = s.substring(i, i + size).toCharArray();
            Arrays.sort(cur);
            if (Arrays.equals(cur, ppsorted)) {
                ans.add(i);
            }

            }
        
        return ans;
    }
}
