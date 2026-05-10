//14
//Easy

//Write a function to find the longest common prefix string amongst an array of strings.

//If there is no common prefix, return an empty string "".


//Example 1:

//Input: strs = ["flower","flow","flight"]
//Output: "fl"

// my own solution using java:

//use the 1st or any string as a buffer checker, and check that every other element is a prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String target = strs[0];
        ArrayList<String> ar = new ArrayList<>();
        int size = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            sb.append(target.charAt(i));
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(sb.toString())) {
                    //System.out.println(sb);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(sb);
                size = Math.max(size, sb.length());
                ar.add(sb.toString());

            }

        }
        Collections.sort(ar);
        for (String c: ar) {
            if (c.length() == size) {
                return c;
            }
        }
        return "";
    }
}
