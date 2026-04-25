//217
//Easy

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//Example 1:

//Input: nums = [1,2,3,1]

//Output: true

// my own solution using java:

// just use a hashset and compare the lengths

class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            n.add(nums[i]);
        }
        HashSet<Integer> hs = new HashSet<Integer>(n);
        return (nums.length != hs.size());
    }
}
