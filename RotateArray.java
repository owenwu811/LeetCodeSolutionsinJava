//189
//Medium

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 

//Example 1:

//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]

// my own solution using java:

// Just use Collections.rotate():

class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int n: nums) {
            ar.add(n);
        }
        Collections.rotate(ar, k);
        int[] res = new int[nums.length]; 
        for (int i = 0; i < ar.size();i++) {
            nums[i] = ar.get(i);
        }
        
        
    }
}
