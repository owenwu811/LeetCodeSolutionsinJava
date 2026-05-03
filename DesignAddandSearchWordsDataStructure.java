//211
//Medium

//Design a data structure that supports adding new words and finding if a string matches any previously added string.

//Implement the WordDictionary class:

//WordDictionary() Initializes the object.
//void addWord(word) Adds word to the data structure, it can be matched later.
//bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.



// correct java solution (could not solve on my own):

// first check to see if word even contains . before looping to avoid tle

class WordDictionary {
    HashSet<String> hs = new HashSet<>();
    public WordDictionary() {
    }
    
    public void addWord(String word) {
        hs.add(word);
    }
    
    public boolean search(String word) {
        if (!word.contains(String.valueOf('.'))) {
            return hs.contains(word);
        }
        Character star = '.';
        for (String w: hs) {
            boolean flag = true;
            if (w.length() != word.length()) {
                continue;
            }
            for (int i = 0; i < w.length(); i++) {
                if (word.charAt(i) == star) {
                    continue;
                }
                if (word.charAt(i) != w.charAt(i)) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
