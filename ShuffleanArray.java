//384
//Medium

//Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.

//Implement the Solution class:

//Solution(int[] nums) Initializes the object with the integer array nums.
//int[] reset() Resets the array to its original configuration and returns it.
//int[] shuffle() Returns a random shuffling of the array.
 

//Example 1:

//Input
//["Solution", "shuffle", "reset", "shuffle"]
//[[[1, 2, 3]], [], [], []]
//Output
//[null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]

// my own solution using java:

// use Collections.shuffle(), and convert between int array and ArrayList<Integer>

class Solution {

    ArrayList<Integer> ar = new ArrayList<>();
    ArrayList<Integer> snapshot;
    public Solution(int[] nums) {
        for (int n: nums) {
            ar.add(n);
        }
        this.snapshot = new ArrayList<>(ar);
        
    }
    
    public int[] reset() {
        int[] ans = new int[ar.size()];
        int i = 0;
        for (Integer a: snapshot) {
            ans[i] = a;
            i++;
        }
        return ans;
        
    }
    
    public int[] shuffle() {
        Collections.shuffle(ar);
        int[] ans = new int[ar.size()];
        int i = 0;
        for (Integer a: ar) {
            ans[i] = a;
            i++;
        }
        return ans;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
