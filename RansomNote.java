//383
//Easy

//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

//Each letter in magazine can only be used once in ransomNote.

 
//Example 1:

//Input: ransomNote = "a", magazine = "b"
//Output: false

// my own solution using java:

// compare the hashmaps to see if there is any discrepency

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] rn = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        HashMap<String, Integer> one = new HashMap<>();
        HashMap<String, Integer> two = new HashMap<>();
        for (char r: rn) {
            if (one.containsKey(String.valueOf(r))) {
                int val = one.get(String.valueOf(r));
                one.remove(String.valueOf(r), val);
                one.put(String.valueOf(r), val + 1);
            } 
            else {
                one.put(String.valueOf(r), 1);
            }
        }
        for (char mm: m) {
            if (two.containsKey(String.valueOf(mm))) {
                int val = two.get(String.valueOf(mm));
                two.remove(String.valueOf(mm), val);
                two.put(String.valueOf(mm), val + 1);
            }
            else {
                two.put(String.valueOf(mm), 1);
            }
        }
        for (Object o: one.keySet()) {
            if (!two.containsKey(o)) {
                return false;
            } 
            if (two.get(o) < one.get(o)) {
                return false;
            }
        }
        return true;
    }
}
