//49
//Medium

//Given an array of strings strs, group the anagrams together. You can return the answer in any order.

//Example 1:

//Input: strs = ["eat","tea","tan","ate","nat","bat"]

//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// my own solution using java:

// use the sorted string as the key and original words as the values, and return the values of the hashmap

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for (String word: strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!hm.containsKey(sorted)) {
                hm.put(sorted, new ArrayList<String>());
            }
            hm.get(sorted).add(word);
        }
        System.out.println(hm);
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> entry: hm.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
        
    }
}
