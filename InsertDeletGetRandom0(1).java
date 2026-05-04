//380
//Medium

//Implement the RandomizedSet class:

//RandomizedSet() Initializes the RandomizedSet object.
//bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
//bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
//int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
//You must implement the functions of the class such that each function works in average O(1) time complexity.


//Example 1:

//Input
//["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
//[[], [1], [2], [2], [], [1], [2], []]
//Output
//[null, true, false, true, 2, true, false, 2]


// my own solution using java:

// use hashset and built in random library


class RandomizedSet {

    HashSet<Integer> hs = new HashSet<>();
    public RandomizedSet() {
        
        
    }
    
    public boolean insert(int val) {
        if (!hs.contains(val)) {
            hs.add(val);
            return true;
        }
        return false;

        
    }
    
    public boolean remove(int val) {
        if (hs.contains(val)) {
            hs.remove(val);
            return true;
        }
        return false;
        
        
    }
    
    public int getRandom() {
        ArrayList<Integer> ar = new ArrayList<>();
        for (Integer num: hs) {
            ar.add(num);
        }
        Random rand = new Random();
        int randomElement = ar.get(rand.nextInt(ar.size()));
        return randomElement;
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
