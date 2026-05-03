//Medium
//151

//Given an input string s, reverse the order of the words.

//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

//Return a string of the words in reverse order concatenated by a single space.

//Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

//Example 1:

//Input: s = "the sky is blue"
//Output: "blue is sky the"


// my own solution using java:

// just use addFirst and reduce unecessary spaces

class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] c = s.split(" ");
        ArrayList<String> ar = new ArrayList<>();
        System.out.println(c);
        for (String word: c) {
            System.out.println(word);
            if (!word.isEmpty()) {
                ar.addFirst(word);
        }
        }  
        String ans = "";
        int cnt = 0;
        for (String word: ar) {
            ans += word;
            if (cnt < ar.size() - 1) {ans += " ";}
            cnt++;
        }
        return ans;
        
    }
}
