//1429
//Medium

//You have a queue of integers, you need to retrieve the first unique integer in the queue.

//Implement the FirstUnique class:

//FirstUnique(int[] nums) Initializes the object with the numbers in the queue.
//int showFirstUnique() returns the value of the first unique integer of the queue, and returns -1 if there is no such integer.
//void add(int value) insert value to the queue.

// my own solution using java:

// only add to the queue if frequency is 1

class FirstUnique {
    List<Integer> ar = new ArrayList<>();
    Map<Integer, Integer> hm = new HashMap<>();
    public FirstUnique(int[] nums) {
        for (int n: nums) {
            if (hm.containsKey(n)) {
                int val = hm.get(n);
                hm.remove(n);
                hm.put(n, val + 1);
            }
            else {
                hm.put(n, 1);
                ar.add(n);
            }
        }
        
    }
    
    public int showFirstUnique() {
        for (Integer val: ar) {
            if (hm.get(val) == 1) {
                return val;
            }
        }
        return -1;
        
    }
    public void add(int value) {
        ar.add(value);
        if (hm.containsKey(value)) {
            int val = hm.get(value);
            hm.remove(value);
            hm.put(value, val + 1);

        }
        else {
            hm.put(value, 1);
        }

        
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
